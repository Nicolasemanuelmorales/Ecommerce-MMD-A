package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository("ProductoDao")
public class ProductoDaoImpl implements ProductoDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	public List<Producto> consultarProducto(String filtro) {
		
		final Session session = sessionFactory.getCurrentSession();
		return (List<Producto>) session
				.createCriteria(Producto.class)
				.createAlias("tipo", "p")
				.add(Restrictions.like("p.nombre",filtro))
				.list();
	}

}
