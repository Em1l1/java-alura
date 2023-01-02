package com.bytebank.modelo;

public class SistemaInterno extends com.bytebank.modelo.Autenticable {
	
	private String clave = "AluraCursosOnLine";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
		}
	}

}
