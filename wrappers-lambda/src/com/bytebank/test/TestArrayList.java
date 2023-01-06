package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		/**
		 * @<> Forzar a que acepte solo un tipo de objeto
		 */
//		List<Cliente> listaClientes = new LinkedList<>();

//		ArrayList<Cuenta> list = new ArrayList<>();

		// Obligatorio especificar
//		List<Cuenta> list = new Vector<Cuenta>();

		List<Cuenta> list = new ArrayList<Cuenta>();
		// referencia Objeto -> HEAP
		Cuenta cc = new CuentaCorriente(33, 55);
		Cuenta cc2 = new CuentaCorriente(99, 88);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		// [ cc, cc2 ]

		list.add(cc);
		list.add(cc2);
		list.add(cc3);
		
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
		// comparacion de referencia
		if (contiene) {
			System.out.println("Si, es igual (equals)");
		}

		// comparacion por valores
//		if (cc.equals(cc3)) {
//			System.out.println("Si, son iguales");
//		}
	}
}
