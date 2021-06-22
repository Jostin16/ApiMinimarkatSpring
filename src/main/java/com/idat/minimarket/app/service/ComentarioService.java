package com.idat.minimarket.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.minimarket.app.dao.ComentarioDao;
import com.idat.minimarket.app.model.Comentarios;

@Service
@Transactional
public class ComentarioService {
	
	@Autowired
	private ComentarioDao dao;
	
	public List<Comentarios> findAll(){
		return (List<Comentarios>) dao.findAll();
	}
	
	public Comentarios crear(Comentarios comentarios) {
		return dao.save(comentarios);
	}
	
	public List<Object[]> obtenerComentariosArray(){
        return dao.obtenerComentarios();
    }

}
