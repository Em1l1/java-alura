package br.com.collections;
import br.com.collections.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Class5 {
    public static void main(String[] args) {
    Curso curso1 = new Curso("php", 40);
    Curso curso2 = new Curso("JavaScript", 20);
    Curso curso3 = new Curso("Python", 40);
    Curso curso4 = new Curso("Ruby", 50);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);

    System.out.println(cursos);

//    Collections.sort(cursos, Collections.reverseOrder());
    cursos.sort(Comparator.comparing(Curso::getNombre));
//    Collections.sort(cursos.Comparator.comparing(Curso::getNombre).reversed);
    System.out.println(cursos);

    List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
    System.out.println(cursoList);
  }
}
