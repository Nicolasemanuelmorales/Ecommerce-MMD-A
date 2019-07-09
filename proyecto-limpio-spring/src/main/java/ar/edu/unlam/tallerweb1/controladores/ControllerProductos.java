package ar.edu.unlam.tallerweb1.controladores;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@RequestMapping(path = "/favoritos/{id}")	
	public ModelAndView misFavoritos(@PathVariable  Long id,HttpServletRequest request){
		
		Boolean logeado= (Boolean) request.getSession().getAttribute("logeado");
		if(logeado.equals(true)){
		
		HttpSession session = request.getSession();
		ModelMap model = new ModelMap();
		
		Producto miProducto = producto.consultarProductoPorId(id);
		
		System.out.println(miProducto.getFavorito());
		
		String favorito = miProducto.getFavorito();
		
		if(favorito.equals("false")){
			
			miProducto.setFavorito("true");

			session.setAttribute("favorito", miProducto.getFavorito());
			
			System.out.println(miProducto.getFavorito());
			
			List<Producto> lista = producto.traerFavoritos();
			
			model.put("favoritos", lista);
			model.put("id", id);
			return new ModelAndView("favoritos",model);
			
		}else{
			
			miProducto.setFavorito("false");

			session.setAttribute("favorito", miProducto.getFavorito());
			
			System.out.println(miProducto.getFavorito());
			
			List<Producto> lista = producto.traerFavoritos();
			
			model.put("favoritos", lista);
			model.put("id", id);
			return new ModelAndView("favoritos",model);
			
		}
		
	}else{
		return new ModelAndView("redirect:/login");
	}
		

	}
	
//	@RequestMapping(path = "/favoritos/{id}")
//	public ModelAndView misFavoritos(@PathVariable  Long id, HttpServletRequest request){
//					   
//		HttpSession session = request.getSession();
//		ModelMap model = new ModelMap();
//		Producto miProducto = producto.consultarProductoPorId(id);
//		//System.out.println(miProducto.getFavorito());
//		miProducto.setFavorito("true");
//
//		//System.out.println(miProducto.getFavorito());
//		
//		session.setAttribute("favorito", miProducto.getFavorito());
//		
//		model.put("favorito",miProducto);
//		
//		//System.out.println(miProducto.getFavorito());
//		return new ModelAndView("redirect:/favoritos",model);
//	}
	
	@RequestMapping(path = "/favoritos")
	public ModelAndView misFavoritosFalse(HttpServletRequest request){
		
		Boolean logeado= (Boolean) request.getSession().getAttribute("logeado");
		if(logeado.equals(true)){
		ModelMap model = new ModelMap();	
		List<Producto> lista = producto.traerFavoritos();

		model.put("favoritos",lista);
		
		return new ModelAndView("favoritos",model);
	}else{
		return new ModelAndView("redirect:/login");
	}
}
	
}
