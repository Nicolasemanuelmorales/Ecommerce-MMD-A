package ar.edu.unlam.tallerweb1.controlador;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControllerProductos;
import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;

public class TestControladorShop {

	@Test
	public void TestFiltraProducto() {
		
		
		String filtro="bermuda";
		Double formaDeFiltro = 40.0;
		Double formaDeFiltro2 = 50.0;
		String ordenado = "mayor";
		
		ControllerProductos sut = new ControllerProductos();
			
		ServicioProducto servicioProducto = mock(ServicioProducto.class);
		
		sut.setservicioProducto(servicioProducto);
		when(servicioProducto.filtrarProductoPor(filtro,formaDeFiltro,formaDeFiltro2,ordenado)).thenReturn(null);
		
		ModelAndView modelo = sut.filtrarPor(filtro,formaDeFiltro,formaDeFiltro2,ordenado);
		
		assertThat(modelo.getViewName()).isEqualTo("shop");
		
	}
}
