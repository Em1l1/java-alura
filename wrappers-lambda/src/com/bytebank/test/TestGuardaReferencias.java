package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestGuardaReferencias {

	public static void main(String[] args) {
		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaReferencias.adicionar(cc);
		
		Cuenta  cc2 = new CuentaCorriente(44, 55);
		guardaReferencias.adicionar(cc2);
		
		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));
	}
}
