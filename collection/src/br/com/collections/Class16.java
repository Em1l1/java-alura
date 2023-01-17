package br.com.collections;

import br.com.collections.model.Alumno;
import br.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Class16 {
    public static void main(String[] args) {
        // Cursos
        Curso curso1 = new Curso("Historia", 40);

        // Alumons
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

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);

//        curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        while (alumnoIterator.hasNext()) {
            System.out.println(alumnoIterator.next());
        }
    }
}
