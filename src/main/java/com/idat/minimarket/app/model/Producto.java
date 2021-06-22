package com.idat.minimarket.app.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	@Column
	private String nombre;
	@Column
	private Double precio;
	@Column
	private Integer cantidad;
	@Column
	private String marca;
	@Column
	private String url;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Producto(Integer id, String nombre, Double precio, Integer cantidad, String marca, String url) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
		this.url = url;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	@Override
	public String toString() {
		return "{id:" + id + ", nombre:" + nombre + ", precio:" + precio + ", cantidad:" + cantidad
				+ ", marca:" + marca + ", url:" + url + "}";
	}
	
	
	
}
