package ar.edu.unlam.tallerweb1.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.edu.unlam.tallerweb1.dao.ProductoDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;

public class TestSerivicioProducto {
	@Test
	public void TestQueEvaluaConsultarProducto() {
		Tipo remera = new Tipo();
		remera.setNombre("remera");
		
		Producto prod = new Producto();
		prod.setNombre("remera");
		prod.setTipo(remera);
		
		List<Producto> p = new ArrayList<Producto>();
		p.add(prod);
		ServicioProductoImpl sut = new ServicioProductoImpl();
		ProductoDao productoDao = mock(ProductoDao.class);
		sut.setProductoDao(productoDao);
		
		when(productoDao.consultarProducto("remera")).thenReturn(p);
		List<Producto> p2 = sut.consultarProducto("remera");
		assertThat(p2).hasSize(1);
	}
	
	@Test
	public void TestQueEvaluaFiltrarProductoPor() {
		String filtro = "bermuda";
		Double formaDeFiltro = 100.0;
		Double formaDeFiltro2= 600.0;
		String ordenado = "menor";
		
		Tipo bermuda = new Tipo();
		bermuda.setNombre("bermuda");
		
		Producto prod = new Producto();
		prod.setNombre("bermuda");
		prod.setTipo(bermuda);
		prod.setPrecio(500.0);

		Producto prod2 = new Producto();
		prod2.setNombre("bermuda");
		prod2.setTipo(bermuda);
		prod2.setPrecio(999.0);
		
		List<Producto> p = new ArrayList<Producto>();
		p.add(prod);
		p.add(prod2);

		ServicioProductoImpl sut = new ServicioProductoImpl();
		ProductoDao productoDao = mock(ProductoDao.class);
		sut.setProductoDao(productoDao);
		
		when(productoDao.filtrarProductoPor(filtro, formaDeFiltro, formaDeFiltro2, ordenado)).thenReturn(p);
		List<Producto> p2 = sut.filtrarProductoPor(filtro, formaDeFiltro, formaDeFiltro2, ordenado);
		assertThat(p2).hasSize(2);
	}
	
	@Test
	public void TestQueEvaluaConsultarProductoPorId() {		
		Producto p = new Producto();
		p.setId((long)1);
		
		long buscado = (long)1;
		long buscado2 = (long)1;
		
		ServicioProductoImpl sut = new ServicioProductoImpl();
		ProductoDao productoDao = mock(ProductoDao.class);
		sut.setProductoDao(productoDao);
		
		when(productoDao.consultarProductoPorId(buscado)).thenReturn(p);
		Producto p2 = sut.consultarProductoPorId(buscado2);
		assertThat(p2).isEqualTo(p);
	}
}
