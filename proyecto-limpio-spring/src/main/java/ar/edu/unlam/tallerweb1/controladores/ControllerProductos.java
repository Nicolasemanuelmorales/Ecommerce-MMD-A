package ar.edu.unlam.tallerweb1.controladores;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
	public ModelAndView filtrarPor(@RequestParam (required=false) String filtro, @RequestParam(required=false) Double formaDeFiltro,@RequestParam(required=false) Double formaDeFiltro2,@RequestParam(required=false) String ordenado) {
		ModelMap model = new ModelMap();
		System.out.println("---------------------------------");
		System.out.println("producto: " + filtro);
		 if(filtro == null){
			filtro = "%"; 
		 }	
		 
		 //System.out.println(filtro);
		 //System.out.println(formaDeFiltro);
		 
		 System.out.println("desde: "+formaDeFiltro);
		 if(formaDeFiltro == null){
			 formaDeFiltro= 0.0;
		 }
		 
		 System.out.println("hasta: "+formaDeFiltro2);
		 if(formaDeFiltro2 == null){
			 formaDeFiltro2 = 100000.0;
		 }
		 
		 System.out.println("Ordenado por: "+ ordenado);

		 List<Producto> lista = producto.filtrarProductoPor(filtro,formaDeFiltro,formaDeFiltro2,ordenado);
		 
		model.put("xd", lista);
		return new ModelAndView("shop", model);
	}
	
}
