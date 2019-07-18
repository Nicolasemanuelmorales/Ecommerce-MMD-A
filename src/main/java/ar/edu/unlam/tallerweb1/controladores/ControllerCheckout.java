package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioCheckout;

@Controller
public class ControllerCheckout {
	@Inject
	private ServicioCheckout servicio;
	
	@RequestMapping(value = "/checkout")
	public ModelAndView cambiarStock(@RequestParam ("id") Integer id,  @RequestParam ("quantity") Integer cantidad) {
		Long id2 = (long)id;
		servicio.descontarDelStock(id2, cantidad);
		
		return new ModelAndView("redirect:shop");
	}
	

}
