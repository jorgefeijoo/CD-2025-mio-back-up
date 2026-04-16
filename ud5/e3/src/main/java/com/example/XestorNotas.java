package com.example;

/**
 * Clase que representa un gestor de notas para un alumno.
 * Permite almacenar el nombre del alumno, sus calificaciones, y realizar
 * calculos como  la media, obtener la nota máxima, 
 * comprobar si está aprobado y contar los suspensos.
 */
public class XestorNotas {

    /** Nombre del alumno. */
    private String alumno;
    
    /** Array que almacena las notas obtenidas por el alumno. */
    private double[] notas;

    /**
     * Constructor por defecto.
     * Inicializa el nombre del alumno como "Anonimo" y crea un array de notas vacío.
     */
    public XestorNotas() {
        this.alumno = "Anonimo";
        this.notas = new double[0];
    }

    /**
     * Constructor parametrizado.
     *
     * @param alumno El nombre del alumno.
     * @param notas  Un array con las notas iniciales del alumno.
     */
    public XestorNotas(String alumno, double[] notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return El nombre actual del alumno.
     */
    public String getAlumno() {
        return alumno;
    }

    /**
     * Establece o modifica el nombre del alumno.
     *
     * @param alumno El nuevo nombre para el alumno.
     */
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    /**
     * Obtiene el array con las notas del alumno.
     *
     * @return Un array de tipo double que contiene las notas.
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * Establece o sustituye el array de notas del alumno.
     *
     * @param notas El nuevo array de notas que se asignará al alumno.
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * Calcula la nota media aritmética del alumno.
     * Si el alumno no tiene ninguna nota registrada, el método devuelve 0
     * para evitar divisiones por cero.
     *
     * @return La nota media calculada, o 0 si el array de notas está vacío.
     */
    public double calcularMedia() {
        if (notas.length == 0) {
            return 0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }

    /**
     * Calcula la nota máxima que ha obtenido el alumno.
     * Si el alumno no tiene ninguna nota registrada, el método devuelve 0.
     *
     * @return La nota más alta del array, o 0 si el array de notas está vacío.
     */
    public double calcularMaximo() {
        if (notas.length == 0) {
            return 0;
        }

        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }

        return max;
    }

    /**
     * Comprueba si el alumno está aprobado basándose en su nota media.
     * Se considera que un alumno está aprobado si su nota media es igual o superior a 5.
     *
     * @return {@code true} si la media es mayor o igual a 5, {@code false} en caso contrario.
     */
    public boolean estaAprobado() {
        return calcularMedia() >= 5;
    }

    /**
     * Cuenta el número total de asignaturas suspensas.
     * Un suspenso se define como cualquier nota con un valor estrictamente menor a 5.
     *
     * @return El número de notas inferiores a 5.
     */
    public int contarSuspensos() {
        int contador = 0;
        for (double nota : notas) {
            if (nota < 5) {
                contador++;
            }
        }
        return contador;
    }
}