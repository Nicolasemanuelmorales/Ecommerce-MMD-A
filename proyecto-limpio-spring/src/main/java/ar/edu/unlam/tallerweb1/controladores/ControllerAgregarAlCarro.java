package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioAgregarAlCarro;

@Controller
public class ControllerAgregarAlCarro {

	@Inject
	private ServicioAgregarAlCarro prod;

	@RequestMapping(path = "/agregarAlCarro/{id}")
	public ModelAndView agregarAlCarro(@PathVariable Long id, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		Boolean logeado = (Boolean) request.getSession().getAttribute("logeado");
		
		List<Producto> listaPrincipal = new ArrayList<Producto>();
		Integer contCart = 0;	
		Long auxiliar=(long) 0;
		auxiliar = (Long) session.getAttribute("auxiliar");
		
		
		if (logeado.equals(true)) {

			ModelMap model = new ModelMap();
			Producto produc = prod.consultarProductoPorId(id);
			
			if (id.equals(auxiliar)) {
				
				listaPrincipal =(List<Producto>) session.getAttribute("articulosDeCarrito");
				model.put("xd", session.getAttribute("articulosDeCarrito"));
				model.put("id", id);
				return new ModelAndView("carrito", model);

			} else {

				auxiliar = id;
				session.setAttribute("auxiliar",auxiliar);	
				
				listaPrincipal =(List<Producto>) session.getAttribute("articulosDeCarrito");
				listaPrincipal.add(produc);
				session.setAttribute("articulosDeCarrito",listaPrincipal);				
				
				contCart = (Integer) session.getAttribute("contCart");
				contCart++;				
				session.setAttribute("contCart",contCart);
				
				model.put("xd", session.getAttribute("articulosDeCarrito"));
				model.put("id", id);

				return new ModelAndView("carrito", model);
			}

		} else {
			return new ModelAndView("redirect:/login");
		}

	}
}