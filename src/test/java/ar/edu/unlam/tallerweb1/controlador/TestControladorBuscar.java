package ar.edu.unlam.tallerweb1.controlador;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorBuscar;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;
import ar.edu.unlam.tallerweb1.servicios.ServicioBuscar;


public class TestControladorBuscar {
	

	@Test
	public void TestQueBuscaProducto() {
		
		String item="bermuda";
		
		Tipo bermuda = new Tipo();
		bermuda.setNombre("bermuda");
		
		Producto prod = new Producto();
		prod.setNombre("bermuda1");
		prod.setTipo(bermuda);
		prod.setPrecio(500.0);

		Producto prod2 = new Producto();
		prod2.setNombre("bermuda2");
		prod2.setTipo(bermuda);
		prod2.setPrecio(999.0);
		
		List<Producto> p = new ArrayList<Producto>();
		p.add(prod);
		p.add(prod2);
		
		
		ControladorBuscar sut = new ControladorBuscar();
		
		ServicioBuscar servicioBuscar = mock(ServicioBuscar.class);		
		sut.setServicioBuscar(servicioBuscar);
		when(servicioBuscar.consultarBuscarServ(item)).thenReturn(p);
		
		ModelAndView modelo = sut.busqueda(item);
		
		assertThat(modelo.getViewName()).isEqualTo("shop");
		
	}
	
}
