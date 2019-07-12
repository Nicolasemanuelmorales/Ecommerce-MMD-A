package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;
import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;
import ar.edu.unlam.tallerweb1.dao.BuscarDao;

public class BuscarDaoTest extends SpringTest{
	
	@Inject
	private BuscarDao dao;
	
	@Test @Transactional @Rollback
	
	public void buscarProductosPorLike(){
		
		Tipo remeraMangaLarga = new Tipo();
		remeraMangaLarga.setNombre("remeraMangaLarga");		
		
		Producto remera = new Producto();
		remera.setNombre("Asd Dsa");
		remera.setColor("rojo,azul,verde");
		remera.setImagen("aasdsad/asd.jpg");
		remera.setMaterial("algodon,jean");
		remera.setPrecio(450.00);
		remera.setStock(90);
		remera.setTalle("s,m,l,xl");
		remera.setTipo(remeraMangaLarga);
		
		getSession().save(remeraMangaLarga);
		getSession().save(remera);
		
		List<Producto> buscados = dao.consultarBuscarDao("remeraMangaLarga");
		assertThat(buscados).hasSize(7);
	}

}
