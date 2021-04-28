package com.jr.sistemas.mb;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable  
{
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private Date fechaNacimiento;
	
	public void actualizar() {
		FacesContext
		.getCurrentInstance()
		.addMessage(null, new FacesMessage("Perfil actualizado"));
	}
	
	public Date getFechaHoy() {
		return new Date();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
