package com.example;

public class Produto {
private String nome ;
private double prezo;


public Produto(String nome, double prezo) {

     if (nome == null || nome=="") {
        throw new IllegalArgumentException("No puede ser nulo ni estar vacio el nombre ");
    }
     if (prezo <0) {
        throw new IllegalArgumentException("El precio del produto no pueden ser negativos");
    }


    this.nome = nome;
    this.prezo = prezo;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    if (nome == null || nome=="") {
        throw new IllegalArgumentException("El nombre no puede ser null ni ser vacio");
    }
    this.nome = nome;
}
public double getPrezo() {
    return prezo;
}
public void setPrezo(double prezo) {
    if (prezo <0) {
        throw new IllegalArgumentException("El precio del produto no puede ser negativo");
    }
    this.prezo = prezo;
}




}
