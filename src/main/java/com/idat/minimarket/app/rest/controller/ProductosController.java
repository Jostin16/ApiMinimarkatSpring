package com.idat.minimarket.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.minimarket.app.model.Producto;
import com.idat.minimarket.app.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	private ProductoService service;

	@GetMapping("/listarProductos")
	public List<Producto> listar() {		
		return service.findAll();
	}

}
