package com.idat.minimarket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Promociones;

@Repository
public interface PromocionesDao extends CrudRepository<Promociones, Integer> {

}
