package com.idat.minimarket.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.idat.minimarket.app.dao.UsuarioDao;
import com.idat.minimarket.app.model.Usuario;
import com.idat.minimarket.app.service.UsuarioService;

@RestController
@RequestMapping(UsuarioRestController.RESOURCE)
public class UsuarioRestController {
	
	public static final String RESOURCE = "/rest";
	
	@Autowired
	private final UsuarioService service;
	
	@Autowired
	private UsuarioDao dao;
	
	public UsuarioRestController(UsuarioService service) {
		this.service = service;
	}
	
	@GetMapping(value = "/listarUsuario/{id}/")
	public ResponseEntity<Object> getById(@PathVariable("id") Integer id) {
        Usuario usuario = service.findById(id);
        if (usuario == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Usuario no encontrado, id proporcionado no es correcto.");
        return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> insertarLogin(@RequestBody Usuario usuario) {
		Usuario getUser = dao.findByUsuarioAndPassword("ADMIN", "admin");
		if (getUser.getUsuario().equals("ADMIN")) {
			usuario.setId(1);
		}else {
			usuario.setId(2);
		}
		service.login(usuario);
		return new ResponseEntity<>(service.findById(usuario.getId()), HttpStatus.OK);
    }
	
	@DeleteMapping(value = "/eliminarUsuario/{id}/")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

}
