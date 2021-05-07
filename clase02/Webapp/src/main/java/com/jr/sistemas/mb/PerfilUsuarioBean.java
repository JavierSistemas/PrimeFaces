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
	private String estado;
	private String ciudad;
	
	public static final List<Interes> INTERESES = new ArrayList<Interes>();
	
	public   List<String> estados= new ArrayList<String>();
	public   List<String> ciudades = new ArrayList<String>();
	
	static {
		INTERESES.add(new Interes("Deporte","deportes"));
		INTERESES.add(new Interes("Cine","cine"));
		INTERESES.add(new Interes("Computación","computacion"));
		INTERESES.add(new Interes("Lectura","lectura"));
	}
	
	public PerfilUsuarioBean() {
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
		
	}
	
	public void cargarCiudades() {
		ciudades.clear();
		if("MG".equals(estado)) {
			ciudades.add("Lima");
			ciudades.add("Huaraz");
			ciudades.add("Ica");
		}else if("SP".equals(estado)) {
			ciudades.add("Chiclayo");
			ciudades.add("Piura");
			ciudades.add("Tumbes");
		}else if("RJ".equals(estado)) {
			ciudades.add("La Libertad");
			ciudades.add("Cusco");
			ciudades.add("Puno");
		}
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}
}
