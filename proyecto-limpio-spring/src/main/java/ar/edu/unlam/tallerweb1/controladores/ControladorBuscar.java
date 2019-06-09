package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioBuscar;

@Controller
public class ControladorBuscar{

	@Inject
	private ServicioBuscar buscar;
	
	@RequestMapping("/buscar")
	public ModelAndView form(@ModelAttribute("producto") Producto producto){
		return new ModelAndView();
	}
	
	@RequestMapping(path="/buscar-esto", method=RequestMethod.POST)
	public ModelAndView busqueda(@RequestParam ("nombre") String item) {
		ModelMap model = new ModelMap();
		List<Producto> item_buscado = buscar.consultarBuscarServ(item);
		model.put("resultado",item_buscado);
		return new ModelAndView("resp",model);
	}
}
