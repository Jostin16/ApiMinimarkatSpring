package com.idat.minimarket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.idat.minimarket.app.model.Producto;

public interface ProductoDao extends CrudRepository<Producto, Integer> {

}
