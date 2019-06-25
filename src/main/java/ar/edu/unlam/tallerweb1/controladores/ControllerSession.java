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
import ar.edu.unlam.tallerweb1.servicios.ServicioTodosLosProductos;

@Controller
public class ControllerSession {

	private List<Long> lista;
	
	
	
	@Inject
	private ServicioTodosLosProductos prod2;
	
	//carga los productos en pantalla al igual que lo hace shop
	@RequestMapping(path = "/session")
	public ModelAndView session(HttpServletRequest request) {
		if(lista==null) {
			HttpSession session = request.getSession();
			lista = new ArrayList<Long>();
			session.setAttribute("listado",lista);
		}
		ModelMap model = new ModelMap();
		List<Producto> lista = prod2.consultarProducto();
		model.put("xd", lista);
		return new ModelAndView("session",model);
	}
	
	
	@RequestMapping(path = "/agregarAlCarro2/{id}")
	public ModelAndView agregarAlCarro(@PathVariable Long id, HttpServletRequest request) {
			ModelMap model = new ModelMap();
			lista.add(id);
			model.put("listaProductosElegidos", lista );
			return new ModelAndView("redirect:../session");
	}
	
	
	@RequestMapping(path = "/lp")
	public ModelAndView listado(HttpServletRequest request) {
		ModelMap model = new ModelMap();
			model.put("listaProductosElegidos", lista );
			return new ModelAndView("listaProductosCarrito",model);
	}
	
}
