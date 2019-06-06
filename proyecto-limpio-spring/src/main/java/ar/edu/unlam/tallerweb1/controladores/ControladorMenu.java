package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorMenu {

	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(path = "/shop", method = RequestMethod.GET)
	public ModelAndView irAShop() {
		return new ModelAndView("shop");
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public ModelAndView irAAbout() {
		return new ModelAndView("about");
	}
	
	
	@RequestMapping(path = "/cart", method = RequestMethod.GET)
	public ModelAndView irACarrito() {
		return new ModelAndView("carrito");
	}
	
	@RequestMapping(path = "/blog", method = RequestMethod.GET)
	public ModelAndView irABlog() {
		return new ModelAndView("blog");
	}
	
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public ModelAndView irAContact() {
		return new ModelAndView("contact");
	}
}
