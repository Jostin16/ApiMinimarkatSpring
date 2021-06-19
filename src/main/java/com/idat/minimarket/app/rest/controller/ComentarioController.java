package com.idat.minimarket.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idat.minimarket.app.model.Comentarios;
import com.idat.minimarket.app.service.ComentarioService;

@RestController
@RequestMapping("/api")
public class ComentarioController {
	
	@Autowired
	private ComentarioService service;
	
	@GetMapping("/listarComentarios")
	public List<Comentarios> listar() {		
		return service.findAll();
	}

}
