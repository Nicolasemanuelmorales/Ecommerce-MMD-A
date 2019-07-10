package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Favorito;


public interface ServicioFavorito {
	
	List<Favorito> traerFavoritos(String miEmail);
	
	List<Favorito> traerFavoritoPorIdDeProducto(Long id);
	
	Favorito traerFavoritoPorIdDeProductoUnique(Long id);
	
}
