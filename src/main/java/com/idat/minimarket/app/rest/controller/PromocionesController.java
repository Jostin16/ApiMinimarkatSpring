package com.idat.minimarket.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.minimarket.app.model.Promociones;
import com.idat.minimarket.app.service.PromocionesService;

@RestController
@RequestMapping("/api")
public class PromocionesController {
	
	@Autowired
	private PromocionesService service;
	
	@GetMapping("/listarPromociones")
	public List<Promociones> listar(){
		return service.findAll();
	}
}
