package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;

public interface ServicioBuscar {
	List<Producto> consultarBuscarServ(String item);
}
