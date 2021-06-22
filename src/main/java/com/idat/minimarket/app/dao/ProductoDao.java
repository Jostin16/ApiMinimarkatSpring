package com.idat.minimarket.app.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Integer> {

	@Query("from Producto")
	public List<Object[]> obtenerProductos(); 
}
