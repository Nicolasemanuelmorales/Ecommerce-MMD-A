package ar.edu.unlam.tallerweb1.controladores;
import java.util.List;

import javax.inject.Inject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioProducto;

@Controller
public class ControllerProductos {

	@Inject
	private ServicioProducto producto;


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


	public void setservicioProducto(ServicioProducto servicioProducto) {
		
		this.producto=servicioProducto;
	}
		
}
