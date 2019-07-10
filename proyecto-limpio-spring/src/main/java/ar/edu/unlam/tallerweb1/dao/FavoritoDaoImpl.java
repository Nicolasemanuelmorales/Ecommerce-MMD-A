package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Favorito;
import ar.edu.unlam.tallerweb1.modelo.Producto;

@Repository("FavoritoDao")
@Transactional
public class FavoritoDaoImpl implements FavoritoDao{
	
	@Inject
    private SessionFactory sessionFactory;

	@Override @SuppressWarnings("unchecked")
	public List<Favorito> traerFavoritos(String miEmail) {
		final Session session = sessionFactory.getCurrentSession();
		return (List<Favorito>) session
		.createCriteria(Favorito.class)
		.add(Restrictions.like("estado","true"))
		.add(Restrictions.like("emailUser", miEmail))
		.list();	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Favorito> traerFavoritoPorIdDeProducto(Long id) {
		

		final Session session = sessionFactory.getCurrentSession();
		return (List<Favorito>) session
		.createCriteria(Favorito.class)
		.createAlias("producto", "p")
		.add(Restrictions.eq("p.id",id))
		.list();	
	}

	@Override
	public Favorito traerFavoritoPorIdDeProductoUnique(Long id, String miEmail) {
		final Session session = sessionFactory.getCurrentSession();
		return (Favorito) session
		.createCriteria(Favorito.class)
		.add(Restrictions.eq("emailUser",miEmail))
		.createAlias("producto", "p")
		.add(Restrictions.eq("p.id",id))
		.uniqueResult();
	}
	
	
	
	
}
