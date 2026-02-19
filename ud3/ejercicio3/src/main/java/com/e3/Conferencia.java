package com.e3;

import java.util.List;

public class Conferencia<Participantes> {
    private String nome;
    private String local;
    private String data;

    private List<Sesions> sesiones; 
    private List<Participantes> participantes;

    public Conferencia(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public void agregarSes(){

    }

    public boolean registrarparticipante(){

        return true;
        
    }
}
