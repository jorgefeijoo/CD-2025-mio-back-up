package com.e3;

public class ArtigoCientifico{
    private String titulo;
    private String tema;
    private String tipo;

    public ArtigoCientifico(String titulo, String tema, String tipo) {
        this.titulo = titulo;
        this.tema = tema;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

   


    
    public boolean validarLongitud(){
       return true; 
    }
    
}