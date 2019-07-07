package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Producto;
import ar.edu.unlam.tallerweb1.servicios.ServicioDetalleProducto;


@Controller
public class ControladorDetalleProducto {

	@Inject
	private ServicioDetalleProducto prod;
	
	@RequestMapping(path = "/detalleProducto/{filtrar}/{tipo}")
	public ModelAndView validarProducto(@PathVariable Long filtrar,@PathVariable String tipo) {
		ModelMap model = new ModelMap();
		List<Producto> lista = prod.consultarDetalleProducto(filtrar);
		List<Producto> lista2 = prod.consultarProductosRelacionadosDeDetalleProducto(tipo, filtrar);
		model.put("xd2", lista2);
		model.put("xd", lista);
		return new ModelAndView("detalleProducto", model);
	}

}