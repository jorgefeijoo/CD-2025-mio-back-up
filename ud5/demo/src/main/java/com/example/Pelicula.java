package com.example;

import java.util.Objects;

public class Pelicula {
  private String titulo;
  private int anoEstrea;

  public Pelicula(String titulo, int anoEstrea) {
    this.titulo = titulo;
    this.anoEstrea = anoEstrea;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnoEstrea() {
    return anoEstrea;
  }

  public void setAnoEstrea(int anoEstrea) {
    this.anoEstrea = anoEstrea;
  }

  @Override
  public String toString() {
    return "Titulo: " + titulo + " ano de estrea: " + anoEstrea;
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo, anoEstrea);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true; // mesma referencia → son iguais
    if (!(o instanceof Pelicula))
      return false; // diferente tipo → non son iguais
    Pelicula p = (Pelicula) o;
    // comparando nome e idade para igualdade
    return titulo == p.titulo && Objects.equals(titulo, anoEstrea);
  }

}
