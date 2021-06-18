package com.idat.minimarket.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.minimarket.app.dao.ProductoDao;
import com.idat.minimarket.app.model.Producto;

@Service
@Transactional
public class ProductoService {
	
	@Autowired
	private ProductoDao dao;
	
	public List<Producto> findAll(){
		return (List<Producto>) dao.findAll();
	}

}
