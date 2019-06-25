package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.BuscarDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Service("servicioBuscar")
@Transactional
public class ServicioBuscarImpl implements ServicioBuscar{

	@Inject
	private BuscarDao servicioBuscarDao;

	@Override
	public List<Producto> consultarBuscarServ(String item) {
		return servicioBuscarDao.consultarBuscarDao(item);
	}
	
}
