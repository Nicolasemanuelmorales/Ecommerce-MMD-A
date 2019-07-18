package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.FavoritoDao;
import ar.edu.unlam.tallerweb1.modelo.Favorito;

@Service("servicioFavorito")
@Transactional
public class ServicioFavoritoImpl implements ServicioFavorito{
	
	@Inject
	private FavoritoDao servicioFavoritoDao;
	
	@Override
	public List<Favorito> traerFavoritos(String miEmail) {
		return servicioFavoritoDao.traerFavoritos(miEmail);
	}

	@Override
	public List<Favorito> traerFavoritoPorIdDeProducto(Long id) {
		return servicioFavoritoDao.traerFavoritoPorIdDeProducto(id);
	}

	@Override
	public Favorito traerFavoritoPorIdDeProductoUnique(Long id , String miEmail) {
		return servicioFavoritoDao.traerFavoritoPorIdDeProductoUnique(id, miEmail);
	}

	public void setDao(FavoritoDao dao) {
		this.servicioFavoritoDao = dao;
	}

}
