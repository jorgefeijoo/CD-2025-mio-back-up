package com.e3;

import java.util.List;

public class Autor {
   private String nombreCompleto;
   private String email;

   private List<ArtigoCientifico> articulosEscritos;

    public void autor(String nombreCompleto, String email) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }
}
