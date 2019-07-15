package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("DetalleProductoDao")
public class DetalleProductoImpl implements DetalleProductoDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override @SuppressWarnings("unchecked")
	public List<Producto> consultarDetalleProducto(Long filtro) {
		
		final Session session = sessionFactory.getCurrentSession();
		return (List<Producto>) session
				.createCriteria(Producto.class)
				.add(Restrictions.like("id",filtro))
				.list();
	}
	
	
	@Override @SuppressWarnings("unchecked")
	public List<Producto> consultarProductosRelacionadosDeDetalleProducto(String tipo, Long filtro) {
		
		final Session session = sessionFactory.getCurrentSession();
		return (List<Producto>) session
				.createCriteria(Producto.class)
				.add(Restrictions.ne("id",filtro))
				.createAlias("tipo","t")
				.add(Restrictions.eq("t.nombre",tipo))
				.list();
	}
	

}