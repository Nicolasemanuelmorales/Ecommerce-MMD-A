package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;

public interface ServicioProducto {
	
	List<Producto> consultarProducto(String filtrar);

	List<Producto> filtrarProductoPor(Double formaDeFiltro, Double formaDeFiltro2);
	
}
