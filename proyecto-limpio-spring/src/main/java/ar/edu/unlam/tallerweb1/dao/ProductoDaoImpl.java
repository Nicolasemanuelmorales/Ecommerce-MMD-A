package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("ProductoDao")
public class ProductoDaoImpl implements ProductoDao {

	@Inject
    private SessionFactory sessionFactory;

	
	public Producto consultarProducto (String filtro) {


		final Session session = sessionFactory.getCurrentSession();
		return (Producto) session.createCriteria(Producto.class)
				.add(Restrictions.eq("tipo", filtro))
				.list();
		}

}
