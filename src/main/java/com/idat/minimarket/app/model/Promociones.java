package com.idat.minimarket.app.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "promociones")
public class Promociones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column
	private String nombre_producto;
	
	@Column
	private Double precio_normal;
	
	@Column
	private Double precio_oferta;
	
	@Column
	private String url;

	public Promociones() {
		super();
	}

	public Promociones(Integer id, String nombre_producto, Double precio_normal, Double precio_oferta, String url) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		this.precio_normal = precio_normal;
		this.precio_oferta = precio_oferta;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Double getPrecio_normal() {
		return precio_normal;
	}

	public void setPrecio_normal(Double precio_normal) {
		this.precio_normal = precio_normal;
	}

	public Double getPrecio_oferta() {
		return precio_oferta;
	}

	public void setPrecio_oferta(Double precio_oferta) {
		this.precio_oferta = precio_oferta;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
