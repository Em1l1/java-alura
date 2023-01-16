package br.com.collections;

import br.com.collections.model.Clase;
import br.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class6 {
    public static void main(String[] args) {
    Curso curso1 = new Curso("php", 40, new ArrayList<>());
    curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("Array"));
        curso1.addClase(new Clase("List"));

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);

    System.out.println(cursos.get(0).getClaseList());
  }
}
