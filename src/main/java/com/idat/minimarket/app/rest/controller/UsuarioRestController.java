package com.idat.minimarket.app.rest.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idat.minimarket.app.model.Usuario;
import com.idat.minimarket.app.service.UsuarioService;
import com.idat.minimarket.app.utils.GenericResponse;

@RestController
@RequestMapping("api/usuario")
public class UsuarioRestController {
	
    private final UsuarioService service;

    public UsuarioRestController(UsuarioService service) {
        this.service = service;
    }
    
    @PostMapping("/login")
    public GenericResponse<Usuario> login(HttpServletRequest request){
        String email = request.getParameter("email");
        String contrasenia = request.getParameter("password");
        return this.service.login(email, contrasenia);
    }

}
