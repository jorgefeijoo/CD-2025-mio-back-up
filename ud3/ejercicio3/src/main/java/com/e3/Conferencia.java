package com.e3;

import java.util.List;

public class Conferencia<Participante> {
    private String nome;
    private String local;
    private String data;
    private List<Sesions> Sesions; 
    private List<Participante> Participantes;

    public Conferencia(String nome, String local, String data, List<com.e3.Sesions> sesions,
        List<Participante> participantes) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        Sesions = sesions;
        Participantes = participantes;
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
