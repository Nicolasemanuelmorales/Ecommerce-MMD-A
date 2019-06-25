package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;

public interface ServicioAgregarAlCarro {

	List<Producto> consultarProductoPorId(Long id);
}
