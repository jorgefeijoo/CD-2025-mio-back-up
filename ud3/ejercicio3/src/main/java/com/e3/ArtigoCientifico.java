package com.e3;

public class ArtigoCientifico{
    private String titulo;
    private String tema;
    private String corto;
    private String largo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getCorto() {
        return corto;
    }

    public void setCorto(String corto) {
        this.corto = corto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public ArtigoCientifico(String titulo, String tema, String corto, String largo) {
        this.titulo = titulo;
        this.tema = tema;
        this.corto = corto;
        this.largo = largo;
    }

    public String obtenerResumenCorto(){
        return corto;
    }
    public boolean validarLongitud(){
       return true; 
    }
    
}