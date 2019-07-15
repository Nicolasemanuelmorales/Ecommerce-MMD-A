package ar.edu.unlam.tallerweb1.servicios;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.dao.AgregarAlCArroDao;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Service("ServicioAgregarAlCarro")
@Transactional
public class ServicioAgregarAlCarroImpl implements ServicioAgregarAlCarro {
	

	@Inject
	private AgregarAlCArroDao servicioTodosLosProductosDao;

	@Override
	public Producto consultarProductoPorId(Long id) {
		return servicioTodosLosProductosDao.consultarProductoPorId(id);
	}
	
}
