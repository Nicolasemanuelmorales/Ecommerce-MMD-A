package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.DetalleProductoDao;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Service("servicioDetalleProducto")
@Transactional
public class ServicioDetalleProductoImpl implements ServicioDetalleProducto{

	@Inject
	private DetalleProductoDao servicioDetalleProductoDao;

	@Override
	public List<Producto> consultarDetalleProducto(Long filtro) {
		return servicioDetalleProductoDao.consultarDetalleProducto(filtro);
	}
	
	@Override
	public List<Producto> consultarProductosRelacionadosDeDetalleProducto(String tipo, Long filtro) {
		return servicioDetalleProductoDao.consultarProductosRelacionadosDeDetalleProducto(tipo, filtro);
	}
	
}
