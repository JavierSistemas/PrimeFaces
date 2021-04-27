package com.jr.sistemas.mb;

import java.io.Serializable;

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
	
	public void ingresar() {
		System.out.println("Password:"+this.password);
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("Registro actualizado."));
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
}
