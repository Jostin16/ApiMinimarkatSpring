package com.idat.minimarket.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.minimarket.app.dao.UsuarioDao;
import com.idat.minimarket.app.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao dao;
	

	public Usuario findById(Integer id) {
		return dao.findById(id).get();
	}
	
	public List<Object[]> rptaAndMessage(){
        return dao.findWrongUser();
    }

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	
	public void  login(Usuario usuario) {
		Usuario getUser = dao.findByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());
		if (getUser.getUsuario().equals("ADMIN")) {
			usuario.setId(1);
			findById(usuario.getId());	
		}else {
			usuario.setId(2);
			findById(usuario.getId());	
		}
	}
}
