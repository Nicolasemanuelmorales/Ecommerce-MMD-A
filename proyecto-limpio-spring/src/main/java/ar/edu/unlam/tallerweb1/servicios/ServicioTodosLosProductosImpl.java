package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.dao.TodosLosProductosDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Service("ServicioTodosLosProductos")
@Transactional
public class ServicioTodosLosProductosImpl implements ServicioTodosLosProductos {
	

	@Inject
	private TodosLosProductosDao servicioTodosLosProductosDao;

	@Override
	public List<Producto> consultarProducto() {
		return servicioTodosLosProductosDao.consultarProducto();
	}
	
}
