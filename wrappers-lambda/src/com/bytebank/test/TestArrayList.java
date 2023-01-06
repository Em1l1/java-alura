package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		/**
		 * @<> Forzar a que acepte solo un tipo de objeto
		 */
		ArrayList<Cuenta> list = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(33, 55);
		Cuenta cc2 = new CuentaCorriente(99, 88);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		// [ cc, cc2 ]

		list.add(cc);
		list.add(cc2);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);

		Cuenta obtenerCuenta = list.get(0);
		System.out.println(obtenerCuenta);
		
//		int tamano = obtenerCuenta.getCantidadDeElementos();
//        System.out.println(tamano);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Por cada cuenta : lista
		for (Cuenta cuenta : list) {
			System.out.println(cuenta);
		}

		boolean contiene = list.contains(cc3);
		if (contiene) {
			System.out.println("Si");
		}
	}
}
