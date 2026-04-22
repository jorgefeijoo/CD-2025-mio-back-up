package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestUser {

    @Test
    void TestConstructor() {
        User u1 = new User("67", "Anso");
        assertEquals("Anso", u1.getName());
        assertEquals("67", u1.getId());
    }

    @Test
    void TestAddLoanRemoveLoan() {
        User u1 = new User("67", "Anso");
        Book b1 = new Book("321", "Libro prueba");
        Loan l1 = new Loan(b1, u1);
        u1.addLoan(l1);
        assertTrue(u1.getLoans().contains(l1));
        u1.removeLoan(l1);
        assertFalse(u1.getLoans().contains(l1));
    }

    @Test
    void addMore3Books() {
        User u1 = new User("67", "Anso");
        Book b1 = new Book("321", "Libro prueba");
        Book b2 = new Book("123", "Libro prueba");
        Book b3 = new Book("67", "Libro prueba");

        Loan l1 = new Loan(b1, u1);
        Loan l2 = new Loan(b2, u1);
        Loan l3 = new Loan(b3, u1);

        u1.addLoan(l1);
        u1.addLoan(l2);
        u1.addLoan(l3);

        Exception excepcion = assertThrows(IllegalStateException.class, () -> {
           u1.addLoan(l3);
        });
        assertEquals("Max loans reached", excepcion.getMessage());
    }

}
