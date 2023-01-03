package com.bytebank.modelo;

public class GuardaReferencias {
	
	/**
	 * TodoCrear un objecto para guardar muchas Cuentas
	 * !Permitirnos agregar con un metodo
	 * @GuardarCuentas.adiciona(cuenta);
	 * @obtener, remover, etc.
	 */
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	/**
	 * [ x | x | x |  |  |  | ] 
	 */
	
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
//	
//	public int getCantidadDeElementos() {
//        return this.referencia;
//    }

}
