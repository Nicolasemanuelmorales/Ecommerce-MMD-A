package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;

public interface ProductoDao {

	List<Producto> consultarProducto(String filtro);

}
