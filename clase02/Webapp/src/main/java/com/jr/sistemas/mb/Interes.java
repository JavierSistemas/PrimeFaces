package com.jr.sistemas.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Interes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String nombreIcono;
	
	public Interes(String descripcion, String nombreIcono) {
		this.descripcion= descripcion;
		this.nombreIcono = nombreIcono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreIcono() {
		return nombreIcono;
	}

	public void setNombreIcono(String nombreIcono) {
		this.nombreIcono = nombreIcono;
	}
}
