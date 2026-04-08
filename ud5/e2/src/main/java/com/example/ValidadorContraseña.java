package com.example;

public class ValidadorContraseña {
    public boolean esValida(String contraseña) {
        boolean tieneMayuscula = contraseña.matches(".*[A-Z].*");
        boolean tieneMinuscula = contraseña.matches(".*[a-z].*");
        boolean tieneNumero = contraseña.matches(".*[0-9].*");
        boolean tieneCaracterEspecial=contraseña.matches(".*[!@#$%^&*].*");

        if (contraseña.length() < 8) {
            return false;
        } else if (!tieneCaracterEspecial){
            return false;
        } else if (!tieneMayuscula) {
            return false;
        } else if (!tieneMinuscula) {
            return false;
        } else if (!tieneNumero) {
            return false;
        } else {
            return true;
        }
    }

}
