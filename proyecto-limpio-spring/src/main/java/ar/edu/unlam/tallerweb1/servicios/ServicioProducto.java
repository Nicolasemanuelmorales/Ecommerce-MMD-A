package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;

public interface ServicioProducto {
	
	List<Producto> consultarProducto(String filtrar);

	List<Producto> filtrarProductoPor(String filtro, Double formaDeFiltro, Double formaDeFiltro2, String ordenado);

	List<Producto> traerFavoritos();

	Producto consultarProductoPorId(Long id);
	
}
