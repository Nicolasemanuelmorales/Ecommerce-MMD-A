package ar.edu.unlam.tallerweb1.controladores;


import java.util.List;

import javax.inject.Inject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;

import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;

@Controller
public class ControllerProductos {

	@Inject
	private ServicioProducto producto;
	
//	@RequestMapping(path = "/shop/{filtrar}")
//	public ModelAndView validarProducto(@ String filtrar) {
//		
//		ModelMap model = new ModelMap();
//		List<Producto> lista = producto.consultarProducto(filtrar);
//		model.put("xd", lista);
//		return new ModelAndView("shop", model);
//	}
	
	@RequestMapping(path = "/shop/")
	public ModelAndView filtrarPor(@RequestParam (required=false) String filtro, @RequestParam(required=false) Double formaDeFiltro,@RequestParam(required=false) Double formaDeFiltro2) {
		ModelMap model = new ModelMap();
		 System.out.println(filtro);
		 if(filtro == null){
			filtro = "%"; 
		 }		 
		 System.out.println(filtro);
		 System.out.println(formaDeFiltro2);
		 if(formaDeFiltro2 == null){
			 formaDeFiltro2 = 100000.0;
		 }
		 System.out.println(formaDeFiltro2);
		 if(formaDeFiltro == null){
			 formaDeFiltro= 0.0;
		 }
		 System.out.println(formaDeFiltro);
		 List<Producto> lista = producto.filtrarProductoPor(filtro,formaDeFiltro,formaDeFiltro2);
		model.put("xd", lista);
		return new ModelAndView("shop", model);
	}
	
}
