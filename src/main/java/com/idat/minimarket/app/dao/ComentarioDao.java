package com.idat.minimarket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Comentarios;

@Repository
public interface ComentarioDao extends CrudRepository<Comentarios, Integer> {

}
