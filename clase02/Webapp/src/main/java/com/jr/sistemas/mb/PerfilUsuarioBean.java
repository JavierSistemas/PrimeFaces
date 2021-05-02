package com.jr.sistemas.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private String profesion;
	private Interes interes;
	
	public static final List<Interes> INTERESES = new ArrayList<Interes>();
	
	static {
		INTERESES.add(new Interes("Deporte","deporte"));
		INTERESES.add(new Interes("Cine","cine"));
		INTERESES.add(new Interes("Computación","computacion"));
		INTERESES.add(new Interes("Lectura","lectura"));
	}
	
	public List<Interes> getIntereses(){
		return INTERESES;
	}
	
	
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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public Interes getInteres() {
		return interes;
	}

	public void setInteres(Interes interes) {
		this.interes = interes;
	}
	
}
