package ar.edu.unlam.tallerweb1.modelo;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Tipo;


import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import static org.assertj.core.api.Assertions.*;

public class TestTipo extends SpringTest{

	@Test
	@Transactional @Rollback(true)
	public void testQueEvaluaCreacionDeUnTipo() {
		Session session = getSession();
		
		Tipo tipo1 = new Tipo();
		tipo1.setNombre("pantalon");
		session.save(tipo1);
		
		Tipo tipo2 = new Tipo();
		tipo2.setNombre("remera");
		session.save(tipo2);
		
		@SuppressWarnings("unchecked")
		List<Tipo> t = getSession()
				.createCriteria(Tipo.class,"t")
				.add(Restrictions.eq("t.nombre", "remera"))
				.list();
		assertThat(t).hasSize(1);
	}

}
