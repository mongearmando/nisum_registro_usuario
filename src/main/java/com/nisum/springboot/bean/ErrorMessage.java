package com.nisum.springboot.bean;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage {
	
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
