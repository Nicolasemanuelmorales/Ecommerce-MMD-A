package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ProductoDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("servicioProducto")
@Transactional
public class ServicioProductoImpl implements ServicioProducto{

	@Inject
	private ProductoDao servicioProductoDao;

	@Override
	public List<Producto> consultarProducto(String filtro) {
		return servicioProductoDao.consultarProducto(filtro);
	}
	
}
