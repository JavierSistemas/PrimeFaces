package com.jr.sistemas.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.jr.sistemas.mb.Interes;
import com.jr.sistemas.mb.PerfilUsuarioBean;

@FacesConverter("interes")
public class InteresConverter implements Converter 
{

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value!=null) {
			for(Interes interes : PerfilUsuarioBean.INTERESES) {
				if (value.equals(interes.getNombreIcono())) {
					return interes;
				}
			}
		}	
		return null;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value!=null) {
			Interes interes = (Interes)value;
			return interes.getNombreIcono();
		}
		return null;
	}

}
