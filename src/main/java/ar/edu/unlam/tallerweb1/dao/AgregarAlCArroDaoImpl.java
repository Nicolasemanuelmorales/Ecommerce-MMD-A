package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("AgregarAlCarroDao")
public class AgregarAlCArroDaoImpl implements AgregarAlCArroDao {

	@Inject
    private SessionFactory sessionFactory;
	
	@Override

	public Producto consultarProductoPorId(Long id) {
		
		final Session session = sessionFactory.getCurrentSession();
		
		return (Producto) session
				.createCriteria(Producto.class)
				.add(Restrictions.eq("id",id))
				.uniqueResult()	;
	}
}
