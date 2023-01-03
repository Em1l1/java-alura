package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Cuenta cc = new CuentaCorriente(33, 55);
		Cuenta cc2 = new CuentaCorriente(99, 88);
		
		list.add(cc);
		list.add(cc2);
		
		Cuenta obtenerCuenta = (Cuenta) list.get(0);
		System.out.println(obtenerCuenta);
	}
}
