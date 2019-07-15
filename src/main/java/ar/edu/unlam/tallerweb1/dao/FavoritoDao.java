package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Favorito;

public interface FavoritoDao {
	
	List<Favorito> traerFavoritos(String miEmail);

	List<Favorito> traerFavoritoPorIdDeProducto(Long id);

	Favorito traerFavoritoPorIdDeProductoUnique(Long id , String miEmail);
}
