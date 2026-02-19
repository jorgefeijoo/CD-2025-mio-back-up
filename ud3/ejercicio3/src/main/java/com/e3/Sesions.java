package com.e3;

import java.util.List;

public class Sesions {
    private String titulo;
    private String codigoSala;

    private List<ArtigoCientifico> articulos;
    private Conferencia conferencia;
    
    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getCodigoSala() {
        return codigoSala;
    }


    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }


    public Sesions(String titulo, String codigoSala) {
        this.titulo = titulo;
        this.codigoSala = codigoSala;
    }

public void asignarArticulo(){

}
public boolean cambiarSala(){

    return true;
    
}
}
