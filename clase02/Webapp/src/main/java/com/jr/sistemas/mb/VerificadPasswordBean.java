package com.jr.sistemas.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class VerificadPasswordBean implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String password;
	private String  nombre;
	private String  sobre;
	
	public void ingresar() {
		System.out.println("Password:"+this.password);
		System.out.println("Sobre:"+this.sobre);
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("Registro actualizado."));
	}
	
	public List<String> completarTexto(String consulta){
		List<String> resultados = new ArrayList<String>();
		if (consulta.startsWith("Jo")) {
			resultados.add("Jorge");
			resultados.add("Jose");
			resultados.add("Jorgito del Castillo");
			resultados.add("Josue Saenz");
		}
		return resultados;
	}
		
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
}
