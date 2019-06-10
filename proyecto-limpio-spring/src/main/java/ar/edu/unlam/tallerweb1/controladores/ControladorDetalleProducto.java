package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioDetalleProducto;


@Controller
public class ControladorDetalleProducto {

	@Inject
	private ServicioDetalleProducto producto;
	
	@RequestMapping(path = "detalleProducto/{filtrar}")
	public ModelAndView validarProducto(@PathVariable Long filtrar) {
		
		ModelMap model = new ModelMap();
		List<Producto> lista = producto.consultarDetalleProducto(filtrar);
		model.put("xd", lista);
		return new ModelAndView("detalleProducto", model);
	}
	
	
	@RequestMapping(path = "/detalleProducto/shop", method = RequestMethod.GET)
	public ModelAndView irAShopOriginal() {
		return new ModelAndView("redirect:/shop");
	}
	
	@RequestMapping(path = "/detalleProducto/about", method = RequestMethod.GET)
	public ModelAndView irAAboutOriginal() {
		return new ModelAndView("redirect:/about");
	}
	
	@RequestMapping(path = "/detalleProducto/blog", method = RequestMethod.GET)
	public ModelAndView irABlogOriginal() {
		return new ModelAndView("redirect:/blog");
	}
	
	@RequestMapping(path = "/detalleProducto/contact", method = RequestMethod.GET)
	public ModelAndView irAContactOriginal() {
		return new ModelAndView("redirect:/contact");
	}
	
	@RequestMapping(path = "/detalleProducto/cart", method = RequestMethod.GET)
	public ModelAndView irACarritoOriginal() {
		return new ModelAndView("redirect:/carrito");
	}
	
	@RequestMapping(path = "/detalleProducto/index", method = RequestMethod.GET)
	public ModelAndView irAIndexOriginal() {
		return new ModelAndView("redirect:/index");
	}
	
	
}