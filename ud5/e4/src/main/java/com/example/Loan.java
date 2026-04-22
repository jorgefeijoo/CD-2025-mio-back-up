package com.example;

import java.time.LocalDate;

/**
 * Te dice la fecha de inicio de un prestamo la fecha de finalizacion
 * y si esta activo o no
 */
public class Loan {

    private Book book;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * Constructor al que se le pasa un libro y un usuario
     * 
     * @param book Libro
     * @param user Usuario
     */
    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.startDate = LocalDate.now();
    }

    /**
     * Obtiene un libro prestado
     * 
     * @return devuelve el libro
     */
    public Book getBook() {
        return book;
    }

    /**
     * Obtiene el usuario al que se le presta
     * 
     * @return devuelve el usuario
     */
    public User getUser() {
        return user;
    }

    /**
     * Devuelve la fecha de inicio del prestamo
     * 
     * @return la fecha de inicio
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Simula el fin de un prestamo
     */
    public void closeLoan() {
        this.endDate = LocalDate.now();
    }

    /**
     * Devuelve si el prestamo esta activo
     * 
     * @return si esta activo
     */
    public boolean isActive() {
        return endDate == null;
    }
}