package ar.edu.unlam.tallerweb1.controladores;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Controller
public class ControladorMenu {
	
	private Integer contador= 1;

	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public ModelAndView irAIndex(@ModelAttribute("producto") Producto producto){
		return new ModelAndView("index");
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public ModelAndView irAAbout() {
		return new ModelAndView("about");
	}

	@RequestMapping(path = "/blog", method = RequestMethod.GET)
	public ModelAndView irABlog() {
		return new ModelAndView("blog");
	}
	
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public ModelAndView irAContact() {
		return new ModelAndView("contact");
	}
	
	@RequestMapping(path = "/cart", method = RequestMethod.GET)
	public ModelAndView irACarrito(HttpServletRequest request) {
		ModelMap model = new ModelMap();
		HttpSession session = request.getSession();
		
		model.put("xd", session.getAttribute("articulosDeCarrito"));
		model.put("total", session.getAttribute("totalcarrito"));
		return new ModelAndView("carrito", model);
	}
	
		
}
