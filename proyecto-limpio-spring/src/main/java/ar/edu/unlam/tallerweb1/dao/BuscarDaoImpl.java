package ar.edu.unlam.tallerweb1.dao;

import java.util.List;
import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("BuscarDao")
public class BuscarDaoImpl implements BuscarDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override @SuppressWarnings("unchecked")
	public List<Producto> consultarBuscarDao(String item) {
		final Session session = sessionFactory.getCurrentSession();
		return (List<Producto>) session
				.createCriteria(Producto.class, "p")
				.createAlias("p.tipo", "pt")
				.add(Restrictions.like("pt.nombre",item))
				.list();
	}

}

