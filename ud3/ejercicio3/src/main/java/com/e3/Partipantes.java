package com.e3;

public class Partipantes {
    private String orador;
    private String publico;

    public String getOrador() {
        return orador;
    }

    public void setOrador(String orador) {
        this.orador = orador;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public Partipantes(String orador, String publico) {
        this.orador = orador;
        this.publico = publico;
    } 
}
