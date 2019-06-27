package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioAgregarAlCarro;

@Controller
public class ControllerAgregarAlCarro {

	private List<Producto> listaPrincipal = new ArrayList();
	private Double total=0.0;
	
	@Inject
	private ServicioAgregarAlCarro prod;
	
	@RequestMapping(path = "/agregarAlCarro/{id}")
	public ModelAndView agregarAlCarro(@PathVariable Long id, HttpServletRequest request) {
		
		ModelMap model = new ModelMap();
		
		Producto produc = prod.consultarProductoPorId(id);
		
		total+=produc.getPrecio();
		
				
		this.listaPrincipal.add(produc);
				
		HttpSession session = request.getSession();
		session.setAttribute("articulosDeCarrito",this.listaPrincipal);
		session.setAttribute("totalcarrito",this.total);
		
		model.put("xd", session.getAttribute("articulosDeCarrito"));
		model.put("total", session.getAttribute("totalcarrito"));
		return new ModelAndView("carrito", model);
	}
	
}