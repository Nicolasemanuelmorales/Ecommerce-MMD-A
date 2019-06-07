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
	
	@RequestMapping(path = "/shop/shop", method = RequestMethod.GET)
	public ModelAndView irAShopOriginal() {
		return new ModelAndView("redirect:/shop");
	}
	
	@RequestMapping(path = "/shop/about", method = RequestMethod.GET)
	public ModelAndView irAAboutOriginal() {
		return new ModelAndView("redirect:/about");
	}
	
	@RequestMapping(path = "/shop/blog", method = RequestMethod.GET)
	public ModelAndView irABlogOriginal() {
		return new ModelAndView("redirect:/blog");
	}
	
	@RequestMapping(path = "/shop/contact", method = RequestMethod.GET)
	public ModelAndView irAContactOriginal() {
		return new ModelAndView("redirect:/contact");
	}
	
	@RequestMapping(path = "/shop/cart", method = RequestMethod.GET)
	public ModelAndView irACarritoOriginal() {
		return new ModelAndView("redirect:/carrito");
	}
	
	@RequestMapping(path = "/shop/index", method = RequestMethod.GET)
	public ModelAndView irAIndexOriginal() {
		return new ModelAndView("redirect:/index");
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
