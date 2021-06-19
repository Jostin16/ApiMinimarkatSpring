package com.idat.minimarket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Integer> {

}
