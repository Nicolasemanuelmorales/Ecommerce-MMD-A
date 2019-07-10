package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Favorito;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioFavorito;
import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;


@Controller
public class ControladorFavorito {
	
	@Inject
	private ServicioProducto producto;
	@Inject
	private ServicioFavorito favorito;
    @Inject
	private SessionFactory sessionFactory;
	
    
	@RequestMapping(path = "/favoritos")
	public ModelAndView misFavoritosFalse(HttpServletRequest request){
		
		Boolean logeado= (Boolean) request.getSession().getAttribute("logeado");
		String miEmail = (String) request.getSession().getAttribute("email");
		
		if(logeado.equals(true)){
		ModelMap model = new ModelMap();	
		List<Favorito> lista = favorito.traerFavoritos(miEmail);
			
		model.put("favoritos",lista);
		
		return new ModelAndView("favoritos",model);
	}else{
		return new ModelAndView("redirect:/login");
	}
}
	//y ahora que pedo
	
//	@RequestMapping(path = "/favoritos/{id}")	
//	public ModelAndView misFavoritos(@PathVariable  Long id,HttpServletRequest request){
//		
//		Boolean logeado= (Boolean) request.getSession().getAttribute("logeado");
//		if(logeado.equals(true)){
//		
//    	HttpSession session = request.getSession();
//		ModelMap model = new ModelMap();
//		
//		Producto miProducto = producto.consultarProductoPorId(id);
//		
//		System.out.println(miProducto.getFavorito());
//		
//		String favorito = miProducto.getFavorito();
//		
//		if(favorito.equals("false")){
//			
//			miProducto.setFavorito("true");
//
//			session.setAttribute("favorito", miProducto.getFavorito());
//			
//			System.out.println(miProducto.getFavorito());
//			
//			List<Producto> lista = producto.traerFavoritos();
//			
//			model.put("favoritos", lista);
//			model.put("id", id);
//			return new ModelAndView("favoritos",model);
//			
//		}else{
//			
//			miProducto.setFavorito("false");
//
//			session.setAttribute("favorito", miProducto.getFavorito());
//			
//			System.out.println(miProducto.getFavorito());
//			
//			List<Producto> lista = producto.traerFavoritos();
//			
//			model.put("favoritos", lista);
//			model.put("id", id);
//			return new ModelAndView("favoritos",model);
//			
//		}
//		
//	}else{
//		return new ModelAndView("redirect:/login");
//	}
//		
//	}
	
	//este? SI
	@Transactional
	@RequestMapping(path = "/favoritos/{id}")	
	public ModelAndView misFavoritos(@PathVariable Long id, HttpServletRequest request){
		
		Boolean logeado= (Boolean) request.getSession().getAttribute("logeado");
		String miEmail = (String) request.getSession().getAttribute("email");
			
		List<Favorito> compruebo = favorito.traerFavoritoPorIdDeProducto(id);
		Favorito miFavorito3 = favorito.traerFavoritoPorIdDeProductoUnique(id);
		
		System.out.println(compruebo.size());
		//System.out.println(miFavorito3.getEstado());
		if(logeado.equals(true)){
		
//		if(miFavorito3.getEstado().equals("false")){
//			
//		  miFavorito3.setEstado("true");
//		  Session session = sessionFactory.getCurrentSession();
//		  session.update(miFavorito3);	
//		  return new ModelAndView("redirect:/favoritos");	
//		}
		
			
		if(compruebo.size() == 0){
		Producto miProducto = producto.consultarProductoPorId(id);
			
		Favorito miFavorito = new Favorito();	
		
		ModelMap model = new ModelMap();
		
		miFavorito.setProducto(miProducto);
		miFavorito.setEstado("true");
		miFavorito.setEmailUser(miEmail);

		Session session = sessionFactory.getCurrentSession();
		session.save(miFavorito);		
		
		//System.out.println(miFavorito.getId());
		
		}else{
			Producto miProducto = producto.consultarProductoPorId(id);
			
			Favorito miFavorito = favorito.traerFavoritoPorIdDeProductoUnique(id);
			//Favorito miFavorito2 = new Favorito();	
			
			ModelMap model = new ModelMap();
			
			//miFavorito.setProducto(miProducto);
			miFavorito.setEstado("false");
			//miFavorito.setEmailUser(miEmail);

			Session session = sessionFactory.getCurrentSession();
			session.update(miFavorito);		
		}
		return new ModelAndView("redirect:/favoritos");		
	}else{
		return new ModelAndView("redirect:/login");
	}
		
//creo que era eso, ahora tira otra cosas, a ver
		// me vuelvo loco JAJAJAJA
	}
	
}
