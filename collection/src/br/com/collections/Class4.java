package br.com.collections;

import br.com.collections.model.Curso;

import java.util.ArrayList;

public class Class4 {
  public static void main(String[] args) {
    Curso curso1 = new Curso("Geometria", 40);
    Curso curso2 = new Curso("Fisica", 20);
    Curso curso3 = new Curso("Quimica", 40);
    Curso curso4 = new Curso("Historia", 50);

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);

    System.out.println(cursos);
  }
}
