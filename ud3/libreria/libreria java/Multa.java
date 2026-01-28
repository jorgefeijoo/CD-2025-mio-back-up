package com.example;

import java.time.LocalDate;

public class Multa {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Prestamo prestamo;

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

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Multa(LocalDate fechaInicio, Prestamo prestamo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = calcularFecha();
        this.prestamo = prestamo;
    }

    public LocalDate calcularFecha() {
        return fechaInicio.plusDays(30);
    }
}