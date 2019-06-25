package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioTodosLosProductos;

@Controller
public class ControladorTodosLosProductos {

	@Inject
	private ServicioTodosLosProductos prod;
	
	@RequestMapping(path = "/shop" , method = RequestMethod.GET)
	public ModelAndView traerTodosLosProductos() {
		
		ModelMap model = new ModelMap();
		List<Producto> lista = prod.consultarProducto();
		model.put("xd", lista);
		return new ModelAndView("shop", model);
	}
	
}
