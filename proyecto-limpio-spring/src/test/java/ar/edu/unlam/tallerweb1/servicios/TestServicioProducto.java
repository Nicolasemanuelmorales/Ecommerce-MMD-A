package ar.edu.unlam.tallerweb1.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;

public class TestServicioProducto extends SpringTest {
	@Inject
	private ServicioProducto producto;
	
	@Test
	@Transactional @Rollback
	public void testQueEvaluaConsultarProducto() {
		
		Tipo remeraX = new Tipo();
		remeraX.setNombre("remeraX");		
		getSession().save(remeraX);
		
		Producto rem = new Producto();
		rem.setNombre("REMERA X");
		rem.setPrecio(450.00);
		rem.setTalle("s,m,l,xl");
		rem.setTipo(remeraX);
		getSession().save(rem);
		
		String filtrar = "remeraX";
		List<Producto> res = producto.consultarProducto(filtrar);
		assertThat(res).hasSize(1);
	}
	
	@Test
	@Transactional @Rollback
	public void testQueEvaluaFiltrarProductoPor() {
		String filtro = "bermudaX";
		Double formaDeFiltro = 1000.00;
		Double formaDeFiltro2 = 1600.00;
		String ordenado = "menor";
		
		Tipo bermudaX = new Tipo();
		bermudaX.setNombre("bermudaX");		
		getSession().save(bermudaX);
		
		Producto ber = new Producto();
		ber.setNombre("BERMUDA X");
		ber.setPrecio(1500.00);
		ber.setTipo(bermudaX);
		getSession().save(ber);
		
		Producto ber2 = new Producto();
		ber2.setNombre("BERMUDA2 X");
		ber2.setPrecio(1003.00);
		ber2.setTipo(bermudaX);
		getSession().save(ber2);
		
		List<Producto> res = producto.filtrarProductoPor(filtro, formaDeFiltro, formaDeFiltro2, ordenado);
		assertThat(res).hasSize(2);
	}
	
}
