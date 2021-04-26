package com.jr.sistemas.mb;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class InversionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String nombreInvertido;
	private int cantidadPalabra;

	public void invertirPalabra() {
		this.nombreInvertido="";
		this.cantidadPalabra=0;
			
		if(this.nombre!=null && !this.nombre.isEmpty()){
			this.cantidadPalabra=1;
		}
			
		for(int i=this.nombre.length()-1;i>=0;i--){
			char letra = this.nombre.charAt(i);	
			this.nombreInvertido +=letra;
			if(letra==' '){
				this.cantidadPalabra++;
			}
		}
		System.out.println("Nombre invertido:"
		+this.nombreInvertido);
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreInvertido() {
		return nombreInvertido;
	}

	public void setNombreInvertido(String nombreInvertido) {
		this.nombreInvertido = nombreInvertido;
	}

	public int getCantidadPalabra() {
		return cantidadPalabra;
	}

	public void setCantidadPalabra(int cantidadPalabra) {
		this.cantidadPalabra = cantidadPalabra;
	}
}
