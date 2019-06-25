package ar.edu.unlam.tallerweb1.modelo;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Usuario;


import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import static org.assertj.core.api.Assertions.*;

public class TestUsuario extends SpringTest {

	@Test
	@Transactional @Rollback(true)
	public void testQueEvaluaCreacionDeUnUsuario() {
		Session session = getSession();
		Usuario u1 = new Usuario();
		u1.setEmail("a@a.com");
		u1.setPassword("1234");
		u1.setRol("USER");
		session.save(u1);
		
		Usuario u2 = new Usuario();
		u2.setEmail("b@b.com");
		u2.setPassword("444");
		u2.setRol("ADMIN");
		session.save(u2);
		
		@SuppressWarnings("unchecked")
		List<Usuario> user = getSession()
				.createCriteria(Usuario.class, "u")
				.add(Restrictions.eq("u.email", "b@b.com"))
				.add(Restrictions.eq("u.password", "444"))
				.list();
		assertThat(user).hasSize(1);
	}

}
