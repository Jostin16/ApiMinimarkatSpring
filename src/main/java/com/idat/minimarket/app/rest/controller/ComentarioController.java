package com.idat.minimarket.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.minimarket.app.dto.ResultsDTO;
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
	
	@PostMapping("/insertarComentario")
	public ResponseEntity<Object> crear(@RequestBody Comentarios comentarios) {
        service.crear(comentarios);
        return new ResponseEntity<Object>("Comentario creado correctamente en BD", HttpStatus.OK);
    }

	@GetMapping("/listar/comentarios")
	public ResponseEntity<Object> buscarComentarios() {
		List<Object[]> listaComentarios = null;
		listaComentarios = service.obtenerComentariosArray();

		// ResultsDTO contiene lo que necesita el objeto dentro del array
		ResultsDTO results = convertir(listaComentarios); // convertir la lista de objetos al Array
		return new ResponseEntity<Object>(results, HttpStatus.OK);
	}

	private ResultsDTO convertir(List<Object[]> listaComentarios) {
		String[] results = new String[listaComentarios.size()];
		
		
		Object[] obj = null;

		for (int i = 0; i < listaComentarios.size(); i++) {
			obj = listaComentarios.get(i);
			results[i] = obj[0].toString();
		}
		return new ResultsDTO(results);
	}

}
