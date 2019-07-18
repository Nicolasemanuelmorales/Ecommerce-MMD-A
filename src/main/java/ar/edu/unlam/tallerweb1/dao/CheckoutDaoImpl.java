package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("CheckoutDao")
public class CheckoutDaoImpl implements CheckoutDao {
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	public void descontarDelStock(Long id, Integer cantidad) {
		Session session = sessionFactory.getCurrentSession();
		Producto p = (Producto) session.createCriteria(Producto.class,"p").add(Restrictions.eq("p.id", id)).uniqueResult();
		Integer nuevoStock = p.getStock() - cantidad;
		//System.out.println("nuevoStock: " + nuevoStock);
		p.setStock(nuevoStock);
		session.save(p);
		//System.out.println("producto encontrado");
	}

}
