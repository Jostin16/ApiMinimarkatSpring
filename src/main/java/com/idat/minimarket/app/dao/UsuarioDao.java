package com.idat.minimarket.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.minimarket.app.model.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByUsuarioAndPassword(String usuario, String password);
	
	@Query("select u.rpta, u.mensaje from Usuario u where u.id=2")
    public List<Object[]> findWrongUser();  

}
