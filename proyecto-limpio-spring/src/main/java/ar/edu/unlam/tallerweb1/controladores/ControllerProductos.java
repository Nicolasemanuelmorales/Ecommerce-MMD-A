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
import ar.edu.unlam.tallerweb1.modelo.Tipo;
import ar.edu.unlam.tallerweb1.servicios.ServicioAgregarAlCarro;
import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;

@Controller
public class ControllerProductos {

	@Inject
	private ServicioProducto producto;
	@Inject
	private ServicioAgregarAlCarro prod;

	@RequestMapping(path = "/shop")
	public ModelAndView filtrarPor(@RequestParam (required=false) String filtro, @RequestParam(required=false) Double formaDeFiltro,@RequestParam(required=false) Double formaDeFiltro2,@RequestParam(required=false) String ordenado) {
		
		ModelMap model = new ModelMap();
				 
		if(filtro == null){
			filtro = "%"; 
		 }	
	 
		 if(formaDeFiltro == null){
			 formaDeFiltro= 0.0;
		 }
		 
		 if(formaDeFiltro2 == null){
			 formaDeFiltro2 = 100000.0;
		 }
		 
		 List<Producto> lista = producto.filtrarProductoPor(filtro,formaDeFiltro,formaDeFiltro2,ordenado);
		 
		 model.put("xd", lista);
		 return new ModelAndView("shop", model);
	}
	
	@RequestMapping(path = "/favoritos")
	public ModelAndView misFavoritos(){
		
		ModelMap model = new ModelMap();
		
		List<Producto> lista = producto.traerFavoritos();
		model.put("favoritos", lista);
		return new ModelAndView("favoritos",model);
	}
	
	@RequestMapping(path = "/cambiarFavorito/{id}")
	public ModelAndView misFavoritos(@PathVariable  Long id){
		
		ModelMap model = new ModelMap();
		Producto miProducto = producto.consultarProductoPorId(id);
		
		miProducto.setFavorito("true");
		miProducto.getFavorito();
		System.out.println(miProducto.getFavorito());
		
		return new ModelAndView("redirect:/favoritos",model);
	}
}
