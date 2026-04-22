package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Te deja ver los prestamos que tiene añadir prestamos o
 * devolver prestamos
 */
public class User {

    private String id;
    private String name;
    private List<Loan> loans;

    /**
     * Creo un usuario sin numero de prestamos
     * 
     * @param id   id del usuario
     * @param name nombre del usuario
     */
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del usuario
     * 
     * @return el nombre del usuario
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el id del usuario
     * 
     * @return id que identifica el usuario
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene la lista con los prestamos
     * 
     * @return los prestamos
     */
    public List<Loan> getLoans() {
        return loans;
    }

    /**
     * Añade un prestamo si tiene mas de 3 prestamos muestra un mensaje de error
     * 
     * @param loan Un Prestamos
     * @throws IllegalStateException si tiene mas de 3 prestamos
     */
    public void addLoan(Loan loan) {
        if (loans.size() >= 3) {
            throw new IllegalStateException("Max loans reached");
        }
        loans.add(loan);
    }

    /**
     * Eliminar un prestamo
     * 
     * @param loan un prestamo
     */
    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }
}