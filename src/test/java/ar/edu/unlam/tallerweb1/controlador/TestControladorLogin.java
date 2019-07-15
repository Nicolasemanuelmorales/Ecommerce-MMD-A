package ar.edu.unlam.tallerweb1.controlador;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorLogin;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

public class TestControladorLogin {
	
	@Test
	public void TestQueEvaluaValidarLoginErroneo() {
		ControladorLogin sut = new ControladorLogin();
		Usuario usuario = null;
		HttpServletRequest request = null;
		
		ServicioLogin servicioLogin = mock(ServicioLogin.class);
		sut.setServicioLogin(servicioLogin);
		when(servicioLogin.consultarUsuario(usuario)).thenReturn(null);
		
		ModelAndView modelo = sut.validarLogin(usuario, request);
		
		assertThat(modelo.getViewName()).isEqualTo("login");
		assertThat(modelo.getModel()).containsKey("error");
		assertThat(modelo.getModel().get("error")).isEqualTo("Usuario o clave incorrecta");
	}
	
	/*@Test
	public void TestQueEvaluaValidarLoginCorrecto() {
		
		ControladorLogin sut = new ControladorLogin();
		Usuario usuario2 = new Usuario();
		HttpServletRequest request = null ;
		
		ServicioLogin servicioLogin2 = mock(ServicioLogin.class);
		sut.setServicioLogin(servicioLogin2);
		when(servicioLogin2.consultarUsuario(usuario2)).thenReturn(null);
		
		ModelAndView modelo = sut .validarLogin(usuario2 , request );
		assertThat(modelo.getViewName()).isEqualTo("index");

	}*/
}
