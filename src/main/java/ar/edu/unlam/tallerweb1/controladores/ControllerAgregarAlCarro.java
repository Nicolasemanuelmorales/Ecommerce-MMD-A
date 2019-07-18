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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioAgregarAlCarro;
import ar.edu.unlam.tallerweb1.servicios.ServicioDetalleProducto;

@Controller
public class ControllerAgregarAlCarro {

	@Inject
	private ServicioAgregarAlCarro prod;

	@SuppressWarnings("unchecked")
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
				//System.out.println(listaPrincipal.size());
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
		
	@SuppressWarnings({ "unchecked" })
	@RequestMapping(path = "/quitarDelCarro2/{id}")
	public ModelAndView quitarDelCarro2(@PathVariable Integer id, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		List<Producto> l = new ArrayList<Producto>();
		Integer contCart = 0;
		
		ModelMap model = new ModelMap();
				
		l = (List<Producto>) session.getAttribute("articulosDeCarrito");
		//l.remove(p);
		switch(id) {
		case 0 : l.remove(0);
		break;
		case 1 : l.remove(1);
		break;
		case 2 : l.remove(2);
		break;
		case 3 : l.remove(3);
		break;
		case 4 : l.remove(4);
		break;
		case 5 : l.remove(5);
		break;
		case 6 : l.remove(6);
		break;
		case 7 : l.remove(7);
		break;
		case 8 : l.remove(8);
		break;
		case 9 : l.remove(9);
		break;
		case 10 : l.remove(10);
		break;
		}
		
		
		session.setAttribute("articulosDeCarrito",l);				
		//System.out.println(listaPrincipal.size());
		contCart = (Integer) session.getAttribute("contCart");
		contCart--;				
		session.setAttribute("contCart",contCart);
		
		model.put("xd", session.getAttribute("articulosDeCarrito"));
		model.put("id", id);
		return new ModelAndView("carrito", model);
			
	}
}