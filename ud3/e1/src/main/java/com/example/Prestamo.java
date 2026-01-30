package com.example;

import java.time.LocalDate;

public class Prestamo {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Lector lector;
    private Copia copia;


    public Prestamo(LocalDate fechaInicio, Lector lector, Copia copia) {
        this.fechaInicio = fechaInicio;
        this.lector = lector;
        this.copia = copia;
        this.fechaFin = calcularFechaFin();
    }

    public LocalDate calcularFechaFin() {
        return fechaInicio.plusDays(15);
    }

    public boolean generarMulta() {
        return LocalDate.now().isAfter(fechaFin);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}
