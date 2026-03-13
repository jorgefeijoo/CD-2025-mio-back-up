package com.example;

/**
 * Gestor para la administración de datos de los alumnos.
 */
public class AlumnoManager {

  public static int contador = 0;
  private String nombre;

  /**
   * Constructor de la clase AlumnoManager.
   *
   * @param nombre Nombre inicial del alumno.
   */
  public AlumnoManager(String nombre) {
    this.nombre = nombre;
    contador++;
  }

  /**
   * Añade la información de un alumno y determina su mayoría de edad.
   *
   * @param name      Nombre del alumno.
   * @param edad      Edad del alumno.
   * @param notaMedia Nota media obtenida.
   */
  public void addAlumno(String name, int edad, double notaMedia) {
    if (edad > 18) {
      System.out.println("Mayor");
    } else {
      System.out.println("Menor");
    }

    int x = 3;
    for (int i = 0; i < 10; i++) {
      System.out.println(i + ":" + name + "-" + notaMedia);
    }
  }

  /**
   * Devuelve una representación en texto del gestor.
   *
   * @return Cadena con los datos actuales.
   */
  @Override
  public String toString() {
    return "AlumnoManager{nombre=" + nombre + ", contador=" + contador + "}";
  }

  /**
   * Actualiza el nombre del alumno.
   *
   * @param nombre Nuevo nombre a establecer.
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtiene el nombre actual del alumno.
   *
   * @return El nombre del alumno.
   */
  public String getNombre() {
    return nombre;
  }
}
