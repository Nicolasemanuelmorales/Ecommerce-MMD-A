package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioCheckout;

@Controller
public class ControllerCheckout {
	@Inject
	private ServicioCheckout servicio;
	
	@RequestMapping(value = "/checkout")
	public ModelAndView cambiarStock(@RequestParam ("id") Integer id,  @RequestParam ("quantity") Integer cantidad, HttpServletRequest request) {
		Long id2 = (long)id;
		servicio.descontarDelStock(id2, cantidad);
		
		HttpSession session = request.getSession();
		List<Producto> listaPrincipal = new ArrayList<Producto>();
		Integer contCart = 0;	
		ModelMap model = new ModelMap();
		
		session.setAttribute("articulosDeCarrito",listaPrincipal);				
		session.setAttribute("contCart",contCart);
		
		model.put("xd", session.getAttribute("articulosDeCarrito"));
		return new ModelAndView("redirect:shop");
	}
	

}
