package br.com.collections;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;

public class Class13 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gutavo Gomez";
        String alumno6 = "Marcia Maria";
        String alumno7 = "Marcia Maria";
        String alumno8 = "Gustavo Gomez";

        Set<String> listaAlumnos = new HashSet<>();
//        Collection<String> listaAlumnos = new HashSet<>();
//        Collection<String> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });

        boolean valida = listaAlumnos.contains("Gustavo Gomez");

        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(max.length());
        System.out.println(valida);

        listaAlumnos.removeIf(alumno -> "Gustavo Gomez".equalsIgnoreCase(alumno));

        System.out.println();
        System.out.println();
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }
}
