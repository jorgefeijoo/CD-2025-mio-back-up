package com.example;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestLoans {

    @Test
    void TestConstructorAndGetStartDate() {
        User u1 = new User("67", "Anso");
        Book b1 = new Book("321", "Libro prueba");

        Loan l1 = new Loan(b1, u1);

        assertEquals(b1, l1.getBook());
        assertEquals(u1, l1.getUser());

        l1.getStartDate();

        assertEquals(LocalDate.now(), l1.getStartDate());

    }

    @Test
    void TestIsActive() {
        User u1 = new User("67", "Anso");
        Book b1 = new Book("321", "Libro prueba");

        Loan l1 = new Loan(b1, u1);

    
        assertTrue(l1.isActive());


        l1.closeLoan();

        assertFalse(l1.isActive());
        
    }

}
