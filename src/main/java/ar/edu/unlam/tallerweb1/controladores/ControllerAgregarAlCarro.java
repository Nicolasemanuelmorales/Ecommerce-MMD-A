package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;

import org.hsqldb.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.modelo.Tipo;
import ar.edu.unlam.tallerweb1.servicios.ServicioAgregarAlCarro;

@Controller
public class ControllerAgregarAlCarro {

//	private List<Producto> listaPrincipal = new LinkedList<Producto>();
	
	
	@Inject
	private ServicioAgregarAlCarro prod;
	
	@RequestMapping(path = "/agregarAlCarro/{id}")
	public ModelAndView agregarAlCarro(@PathVariable Long id) {
		
		ModelMap model = new ModelMap();
		List<Producto> lista = prod.consultarProductoPorId(id);

//		for(Producto l: lista){
//			
//			String color= l.getColor();
//			String material=l.getMaterial();
//			String nombre=l.getNombre();
//			String talle=l.getTalle();
//			String imagen=l.getImagen();
//			Integer stock=l.getStock();
//			Double precio=l.getPrecio();
//			Long idProducto=l.getId();
//			Tipo tipo= l.getTipo();
//			
//			
//			for(Producto l2: listaPrincipal){
//				
//				l2.setColor(color);
//				l2.setId(idProducto);
//				l2.setImagen(imagen);
//				l2.setMaterial(material);
//				l2.setNombre(nombre);
//				l2.setPrecio(precio);
//				l2.setStock(stock);
//				l2.setTalle(talle);
//				l2.setTipo(tipo);
//				
//			}
//		
//		}
	
		model.put("xd", lista);
		return new ModelAndView("carrito", model);
	}
	
}