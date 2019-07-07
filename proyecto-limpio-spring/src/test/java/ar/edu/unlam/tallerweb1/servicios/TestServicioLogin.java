package ar.edu.unlam.tallerweb1.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.*;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLoginImpl;

public class TestServicioLogin {

	@Test
	public void testQueEvaluaServicioLogin() {
		Usuario user = new Usuario();
		ServicioLoginImpl sut = new ServicioLoginImpl();
		//Creamos un falso Dao
		//Stub es un objeto de tipo Test Double, La libreria Mokito llama mock a cualquier stub
		UsuarioDao usuarioDao = mock(UsuarioDao.class);
		sut.setUsuarioDao(usuarioDao);
		//le decimos que cree un usuario determinado y que se maneje con ese solamente
		when(usuarioDao.consultarUsuario(user)).thenReturn(new Usuario());
		Usuario user2 = sut.consultarUsuario(user);
		assertThat(user).isEqualTo(user2);
	}

}
