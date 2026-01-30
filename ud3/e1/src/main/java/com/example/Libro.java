package com.example;

import java.util.ArrayList;

public class Libro {
    private String nome;
    private String tipo;
    private String editorial;
    private int ano;
    private ArrayList<Autor> autores;

    public Libro(String nome, String tipo, String editorial, int ano) {
        this.nome = nome;
        this.tipo = tipo;
        this.editorial = editorial;
        this.ano = ano;
        this.autores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
