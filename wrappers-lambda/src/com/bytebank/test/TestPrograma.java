package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPrograma {
	class Programa {
		public static void main(String[] args) {
			Leccion leccionIntro = new Leccion("Introducción a las Colecciones", 20);
			Leccion leccionModelando = new Leccion("Modelando la clase Leccion", 18);
			Leccion leccionSets = new Leccion("Trabajando con Conjuntos", 16);

			List<Leccion> lecciones = new ArrayList<Leccion>();
			lecciones.add(leccionIntro);
			lecciones.add(leccionModelando);
			lecciones.add(leccionSets);

			Collections.sort(lecciones);

			for (Leccion leccion : lecciones) {
				System.out.println(leccion);
			}
		}
	}

	class Leccion {

		private String titulo;
		private int tiempo;

		public Leccion(String titulo, int tiempo) {
			this.titulo = titulo;
			this.tiempo = tiempo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getTiempo() {
			return tiempo;
		}

		public void setTiempo(int tiempo) {
			this.tiempo = tiempo;
		}

		@Override
		public String toString() {
			return "[título: " + titulo + ", tiempo: " + tiempo + " minutos]";
		}
	}

}
