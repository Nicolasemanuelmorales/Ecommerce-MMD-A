package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.CheckoutDao;

@Service("ServicioCheckout")
@Transactional
public class ServicioCheckoutImpl implements ServicioCheckout{
	
	@Inject
	private CheckoutDao dao;
	
	@Override
	public void descontarDelStock(Long id, Integer cantidad) {
		dao.descontarDelStock(id, cantidad);
	}

}
