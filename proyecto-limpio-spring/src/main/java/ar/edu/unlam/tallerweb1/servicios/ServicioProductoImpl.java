package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ProductoDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Service("servicioProducto")
@Transactional
public class ServicioProductoImpl implements ServicioProducto{

	@Inject
	private ProductoDao servicioProductoDao;

	@Override
	public List<Producto> consultarProducto(String filtro) {
		return servicioProductoDao.consultarProducto(filtro);
	}
	@Override
	public List<Producto> filtrarProductoPor(String filtro, Double formaDeFiltro, Double formaDeFiltro2, String ordenado) {
		return servicioProductoDao.filtrarProductoPor(filtro, formaDeFiltro, formaDeFiltro2, ordenado);
	}
	@Override
	public List<Producto> traerFavoritos() {
		return servicioProductoDao.traerFavoritos();
	}
	@Override
	public Producto consultarProductoPorId(Long id) {
		return servicioProductoDao.consultarProductoPorId(id);
	}
	
}
