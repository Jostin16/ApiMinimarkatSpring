package com.idat.minimarket.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.idat.minimarket.app.dto.ResultsDTO;
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
	
	@PostMapping("/insertarPromocion")
	public ResponseEntity<Object> crear(@RequestBody Promociones promociones) {
        service.crear(promociones);
        return new ResponseEntity<Object>("Promocion creado correctamente en BD", HttpStatus.OK);
    }
	
	@GetMapping(value = "/listar/{id}")
	public 	Promociones buscarPorId(@PathVariable("id") Integer id) {
		Promociones promociones = service.buscarPorId(id);

		if (promociones == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Promocion no encontrada, id proporcionado no es correcto.");

		return  promociones;
	}
	
	
	@GetMapping("/listar/promociones")
	public ResponseEntity<Object> buscarPromociones() {
		List<Object[]> listaPromociones = null;
		listaPromociones = service.obtenerPromocionesArray();
		ResultsDTO results = convertir2(listaPromociones);
		return new ResponseEntity<Object>(results, HttpStatus.OK);
	}
	
	private ResultsDTO convertir2(List<Object[]> listaPromociones) {
		String[] results = new String[listaPromociones.size()]; 

		Object[] obj = null;

		for (int i = 0; i < listaPromociones.size(); i++) {
			obj = listaPromociones.get(i);
			results[i] = obj[0].toString();
		}
		return new ResultsDTO(results);
	}
}
