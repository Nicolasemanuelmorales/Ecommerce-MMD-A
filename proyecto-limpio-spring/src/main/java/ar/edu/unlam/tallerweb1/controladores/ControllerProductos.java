package ar.edu.unlam.tallerweb1.controladores;


import java.util.List;

import javax.inject.Inject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;

import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;

@Controller
public class ControllerProductos {

	@Inject
	private ServicioProducto producto;
	
	@RequestMapping(path = "/shop/{filtrar}")
	public ModelAndView validarProducto(@PathVariable String filtrar) {
		
		ModelMap model = new ModelMap();

		List<Producto> lista = producto.consultarProducto(filtrar);
		
		model.put("xd", lista);
		
		return new ModelAndView("shop2", model);
	}
	
	
}
