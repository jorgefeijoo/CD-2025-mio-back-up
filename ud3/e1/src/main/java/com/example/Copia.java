package com.example;

public class Copia {
    private String identificador;
    private String estado;
    private Libro original;

    public Copia(String identificador, Libro original) {
        this.identificador = identificador;
        this.original = original;
        this.estado = "disponible";
    }

    public void prestar() {
        this.estado = "prestado";
    }

    public void devolver() {
        this.estado = "disponible";
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getOriginal() {
        return original;
    }

    public void setOriginal(Libro original) {
        this.original = original;
    }

    Object getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
