package com.idat.minimarket.app.service;

import java.util.List;
import java.util.Optional;
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
		return  (List<Producto>) dao.findAll();
	}
	
	
	
	public Producto buscarPorId(Integer id) {
		Optional<Producto> producto = dao.findById(id);
		
		if (producto.isPresent())
   		  return dao.findById(id).get();
		else
			return null;
	}

	public List<Producto> findSomeProductos(Integer id){
		return (List<Producto>) dao.findSomeProducts(id);
	}
}
