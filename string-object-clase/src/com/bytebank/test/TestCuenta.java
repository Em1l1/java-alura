package com.bytebank.test;

import com.bytebank.modelo.*;
/*
 * Cuenta va a crear nuevas intancias de CuentaCorriente
 * @version 1.0
 * @
 * @author victor
 */
public class TestCuenta {

	// Modificadores de Acceso
	// public | Accesible desde cualquier parte
  // --default | Accesible dentro del paquete
	// --protected | default + clases hijas
	// private | solo desde la clase misma

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
