package com.idat.minimarket.app.model;
 
import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
 
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String descripcion;
    @Column
    private String url;
 
    public Categoria() {
        super();
    }
 
    public Categoria(Integer id, String descripcion, String url) {
        super();
        this.id = id;
        this.descripcion = descripcion;
        this.url = url;
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
 
    public String getUrl() {
        return url;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }

}
