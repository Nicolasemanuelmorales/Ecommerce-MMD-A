package ar.edu.unlam.tallerweb1.controladores;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;

@Controller
public class ControladorMenu {

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
	public ModelAndView irACarrito() {
		return new ModelAndView("carrito");
	}
	
	/*@RequestMapping(path = "/cart", method = RequestMethod.GET)
	public ModelAndView irACarrito(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			 return new ModelAndView("redirect:/login");
		} else {
			return new ModelAndView("carrito");
		}
	}*/
	
}
