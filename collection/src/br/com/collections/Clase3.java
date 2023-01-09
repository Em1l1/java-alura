package br.com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Clase3 {
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
//
//        System.out.println(cursos);
//
//        // asendente
//        Collections.sort(cursos);
//        System.out.println(cursos);
//
//        // asendente
//        Collections.sort(cursos, Collections.reverseOrder());
//        System.out.println(cursos);

        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);

        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);

//        List<String> cursosList = cursos.stream().sorted().collect(Collections.toList());
//        System.out.println(cursosList);

//        List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(cursosList);
    }
}
