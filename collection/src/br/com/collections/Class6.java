package br.com.collections;

import br.com.collections.model.Aula;
import br.com.collections.model.Curso;

import java.util.ArrayList;

public class Class6 {
    public static void main(String[] args) {
    Curso curso1 = new Curso("php", 40, new ArrayList<>());
    curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("Array"));
        curso1.addAula(new Aula("List"));

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);

    System.out.println(cursos.get(0).getAulaList());
  }
}
