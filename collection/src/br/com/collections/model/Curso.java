package br.com.collections.model;

import java.util.*;

public class Curso {
//        implements Comparable<Curso> {
  private String nombre;
  private int tiempo;
  private List<Aula> aulaList = new ArrayList<>();
//  private Collection<Alumno> alumnos = new LinkedHashSet<>();
  private Collection<Alumno> alumnos = new HashSet<>();
  private Map<String, Alumno> alumnoMap = new HashMap<>();
//  private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();


  public Curso(String nombre, int tiempo) {
    this.nombre = nombre;
    this.tiempo = tiempo;
  }

  public Curso(String nombre, int tiempo, List<Aula> aulaList) {
    this.nombre = nombre;
    this.tiempo = tiempo;
    this.aulaList = aulaList;
  }


  public String getNombre() {
    return nombre;
  }

  public int getTiempo() {
    return tiempo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public List<Aula> getAulaList() {
    return Collections.unmodifiableList(aulaList);
  }

  public void addAula(Aula aula) {
    this.aulaList.add(aula);
  }

  public void addAlumno(Alumno alumno) { this.alumnos.add(alumno);  this.alumnoMap.put(alumno.getCodigo(), alumno); }

  public boolean verificaAlumno(Alumno alumno) { return this.alumnos.contains(alumno); }

  public void setAulaList(List<Aula> aulaList) {
    this.aulaList = aulaList;
  }

  public Collection<Alumno> getAlumnos() {
    return alumnos;
  }

  public Map<String, Alumno> getAlumnoMap() {
    return alumnoMap;
  }

  @Override
  public String toString() {
    return this.nombre;
  }

}
