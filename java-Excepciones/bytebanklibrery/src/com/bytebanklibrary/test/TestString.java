package com.bytebanklibrary.test;



public class TestString {
	public static void main(String[] args) {
		
		String nombre = "Alura";
		// No utilizada en el mundo real
//		String nombre2 = new String("Alura")
		
		System.out.println("Antes de replace: " + nombre);
		nombre.replace("A", "a");
		System.out.println("Despues de replace: " + nombre);

	}
}
