package ar.edu.unlam.tallerweb1.modelo;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;


import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import static org.assertj.core.api.Assertions.*;

public class TestProducto extends SpringTest {
	
	@Test
	@Transactional @Rollback(true)
	public void testQueEvaluaCreacionDeProducto() {
		Session session = getSession();
		Tipo tipo1 = new Tipo();
		tipo1.setNombre("campera");
		session.save(tipo1);
		
		Tipo tipo2 = new Tipo();
		tipo2.setNombre("buzo");
		session.save(tipo2);
		
		
		Producto p1 = new Producto();
		p1.setColor("verde");
		p1.setImagen("ima1");
		p1.setMaterial("nylon");
		p1.setNombre("camuflada");
		p1.setPrecio(2000.00);
		p1.setStock(50);
		p1.setTalle("m");
		p1.setTipo(tipo1);
		session.save(p1);
		
		Producto p2 = new Producto();
		p2.setColor("rojo");
		p2.setImagen("ima2");
		p2.setMaterial("algodon");
		p2.setNombre("buzoBuzo");
		p2.setPrecio(150.00);
		p2.setStock(100);
		p2.setTalle("s");
		p2.setTipo(tipo2);
		session.save(p2);
		
		@SuppressWarnings("unchecked")
		List<Producto> prod = getSession()
				.createCriteria(Producto.class,"p")
				.createAlias("p.tipo", "t")
				.add(Restrictions.eq("p.nombre", "camuflada"))
				.add(Restrictions.eq("p.color", "verde"))
				.add(Restrictions.eq("t.nombre", "campera"))
				.list();
		assertThat(prod).hasSize(0);
	}

}
