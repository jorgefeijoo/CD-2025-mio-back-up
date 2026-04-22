package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestBook {

    @Test
    void TestIsAvailable() {
        Book b1 = new Book("123", "Lazarillo de Tormes");
        assertTrue(b1.isAvailable());
    }

    @Test
    void TestAvailableAfterBorrow() {
        Book b1 = new Book("321", "Don Quijote");
        b1.borrow();
        assertFalse(b1.isAvailable());
    }

    @Test
    void TestGiveBackAfterGiveBack() {
        Book b1 = new Book("321", "Libro prueba");
        b1.borrow();
        b1.giveBack();
        assertTrue(b1.isAvailable());
    }

    @Test
    void TestBorrow() {
        Book b1 = new Book("321", "Libro prueba");
       b1.borrow();
        Exception excepcion = assertThrows(IllegalStateException.class, () -> {
            b1.borrow();
        });
        assertEquals("Book not available", excepcion.getMessage());
    }

    @Test

    void TestConstructor() {
        Book b1 = new Book("321", "Libro prueba");
        assertEquals("Libro prueba", b1.getTitle());
        assertEquals("321", b1.getIsbn());
    }

}
