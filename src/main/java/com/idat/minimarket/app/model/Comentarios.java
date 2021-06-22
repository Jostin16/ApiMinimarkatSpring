package com.idat.minimarket.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comentarios")
public class Comentarios implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	private String descripcion;
	
	private String nombre_usuario;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private String urlFoto;
	
	@PrePersist
	public void insertarFecha() {
		this.fecha = new Date();
	}
	
	public Comentarios() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", descripcion:" + descripcion + ", nombre_usuario:" + nombre_usuario
				+ ", fecha:" + fecha + ", urlFoto:" + urlFoto + "}";
	}
	
	

}
