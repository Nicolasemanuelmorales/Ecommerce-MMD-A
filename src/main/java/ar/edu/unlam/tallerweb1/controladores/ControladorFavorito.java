package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
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
	public ModelAndView misFavoritosFalse(HttpServletRequest request) {

		Boolean logeado = (Boolean) request.getSession().getAttribute("logeado");
		String miEmail = (String) request.getSession().getAttribute("email");

		if (logeado.equals(true)) {
			ModelMap model = new ModelMap();
			List<Favorito> lista = favorito.traerFavoritos(miEmail);

			model.put("favoritos", lista);

			return new ModelAndView("favoritos", model);
		} else {
			return new ModelAndView("redirect:/login");
		}
	}

	@Transactional
	@RequestMapping(path = "/favoritos/{id}")
	public ModelAndView misFavoritos(@PathVariable Long id, HttpServletRequest request) {

		Boolean logeado = (Boolean) request.getSession().getAttribute("logeado");
		String miEmail = (String) request.getSession().getAttribute("email");

		if (logeado.equals(true)) {

			Producto miProducto = producto.consultarProductoPorId(id);
			Favorito miFavorito3 = favorito.traerFavoritoPorIdDeProductoUnique(id, miEmail);

			if (miFavorito3 == null) {
				
				Favorito miFavorito = new Favorito();

				miFavorito.setProducto(miProducto);
				miFavorito.setEstado("true");
				miFavorito.setEmailUser(miEmail);

				Session session = sessionFactory.getCurrentSession();
				session.save(miFavorito);

			} else {
				return new ModelAndView("redirect:/favoritos");			
			}
			return new ModelAndView("redirect:/favoritos");
		} else {
			return new ModelAndView("redirect:/login");
		}
	}

	@Transactional
	@RequestMapping(path = "/SacarDefavoritos/{id}")
	public ModelAndView SacarDemisFavoritos(@PathVariable Long id, HttpServletRequest request) {

		Boolean logeado = (Boolean) request.getSession().getAttribute("logeado");
		String miEmail = (String) request.getSession().getAttribute("email");
		
		if (logeado.equals(true)) {

			Favorito miFavorito = favorito.traerFavoritoPorIdDeProductoUnique(id, miEmail);

			miFavorito.setEstado("false");

			Session session = sessionFactory.getCurrentSession();
			session.update(miFavorito);

			return new ModelAndView("redirect:/favoritos");
		} else {
			return new ModelAndView("redirect:/login");
		}
	}
}
