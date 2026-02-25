package com.e3;

import java.util.ArrayList;
import java.util.List;

public class Participante {
   private String nome;
   private String email;
   private List<Conferencia> conferencias;

   public Participante(String nome, String email) {
      this.nome = nome;
      this.email = email;
      this.conferencias=new ArrayList<>();
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void inscribirEnConferencia(Conferencia conferencia){
      ((List<Conferencia>) conferencia).add(conferencia);
   }

}
