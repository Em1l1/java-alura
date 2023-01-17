package br.com.collections;

import java.util.ArrayList;

import br.com.collections.model.Alumno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;


public class Class14 {
    public static void main(String[] args) {
        Alumno alumno2 = new Alumno("Pepito los Palotes", "001");
        Alumno alumno3 = new Alumno("Juan Carlos", "002");
        Alumno alumno4 = new Alumno( "Pedro Pedrito", "003");
        Alumno alumno1 = new Alumno("Luis Miguel", "004");
        Alumno alumno5 = new Alumno("Gutavo Gomez", "005");
        Alumno alumno6 = new Alumno("Marcia Maria", "006");
        Alumno alumno7 = new Alumno("Marcia Maria", "007");
        Alumno alumno8 = new Alumno("Gustavo Gomez", "008");

//        Set<Alumno> listaAlumnos = new HashSet<>();
//        Collection<String> listaAlumnos = new HashSet<>();
        Collection<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));
    }
}
