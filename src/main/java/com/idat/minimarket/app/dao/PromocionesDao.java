package com.idat.minimarket.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Promociones;

@Repository
public interface PromocionesDao extends CrudRepository<Promociones, Integer> {
	@Query("from Promociones")
	public List<Object[]> obtenerPromociones(); 
}
