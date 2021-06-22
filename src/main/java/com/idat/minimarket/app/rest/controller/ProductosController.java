package com.idat.minimarket.app.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.idat.minimarket.app.dto.ResultsDTO;
import com.idat.minimarket.app.model.Producto;
import com.idat.minimarket.app.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	private ProductoService service;

	@GetMapping("/listarProductos")
	public List<Producto> listar() {
		return (List<Producto>) service.findAll();
	}

	@GetMapping(value = "/{id}")
	public 	Producto buscarPorId(@PathVariable("id") Integer id) {
		Producto producto = service.buscarPorId(id);

		if (producto == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Producto no encontrado, id proporcionado no es correcto.");

		return  producto;
	}

	@GetMapping("/listar/productos")
	public ResponseEntity<Object> buscarProductos() {
		List<Object[]> listaProductos = null;
		listaProductos = service.obtenerProductoArray();

		// ResultsDTO contiene lo que necesita el objeto dentro del array
		ResultsDTO results = convertir(listaProductos); // convertir la lista de objetos al Array
		return new ResponseEntity<Object>(results, HttpStatus.OK);
	}

	private ResultsDTO convertir(List<Object[]> listaProductos) {
		String[] results = new String[listaProductos.size()]; // inicializar con su tamaño

		// Object-->permite almacenar valores genericos sin necesidad el tipo del
		// elemento del objeto

		Object[] obj = null;

		for (int i = 0; i < listaProductos.size(); i++) {
			obj = listaProductos.get(i);
			results[i] = obj[0].toString();
		}
		return new ResultsDTO(results);
	}

}
