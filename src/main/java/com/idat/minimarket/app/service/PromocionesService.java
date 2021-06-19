package com.idat.minimarket.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.minimarket.app.dao.PromocionesDao;
import com.idat.minimarket.app.model.Promociones;

@Service
@Transactional
public class PromocionesService {

	@Autowired
	private PromocionesDao dao;
	
	public List<Promociones> findAll(){
		return (List<Promociones>) dao.findAll();
	}
}
