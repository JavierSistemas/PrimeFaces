package com.jr.sistemas.mb;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import org.apache.log4j.Logger;

@ManagedBean
@ViewScoped
public class RegistroUsuarioBean implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(RegistroUsuarioBean.class);
	
	private String login;
	private String nombre;

	public String getLogin() 			 { return login;			}
	public void setLogin(String login) 	 { this.login = login;		}
	public String getNombre() 			 { return nombre;			}
	public void setNombre(String nombre) { this.nombre = nombre;	}
	
	public void verDisponibilidad() {
		log.info("Inicio verDisponibilidad...");
		log.info("Verificando disponibilidad de:"+this.login);
		
		//para el efecto del gif
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
		}
		
		FacesMessage msg = null;
		if (login.equalsIgnoreCase("user")) {
			msg =new  FacesMessage("El login se encuentra ocupado");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		} else {
			msg =new  FacesMessage("El login disponible");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void registrar() {
		log.info("Login:"+this.login);
		log.info("Nombre:"+this.nombre);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro exitoso."));
	}
}
