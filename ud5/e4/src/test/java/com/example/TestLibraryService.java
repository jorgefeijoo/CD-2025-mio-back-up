package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestLibraryService {

  @Test
  void PruebaañadirLibro() {
    LibraryService ls1 = new LibraryService();
    Book b1 = new Book("123", "libro prueba");
    ls1.addBook(b1);
  }

  @Test
  void PruebaañadirLibroTeniendoloYa() {
    LibraryService ls1 = new LibraryService();
    Book b1 = new Book("123", "libro prueba");
    ls1.addBook(b1);

    Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
      ls1.addBook(b1);
    });
    assertEquals("Book already exists", excepcion.getMessage());

  }

  @Test
  void PruebaañadirUsuario() {
    LibraryService ls1 = new LibraryService();
    User u1 = new User("123", "anso");
    ls1.addUser(u1);
  }

  @Test
  void PruebaañadirUsuarioTeniendoloYa() {
    LibraryService ls1 = new LibraryService();
    User u1 = new User("123", "anso");
    ls1.addUser(u1);
    Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
      ls1.addUser(u1);
    });
    assertEquals("User already exists", excepcion.getMessage());

  }

  @Test
  void PruebaPrestamoLibro() {
    LibraryService ls1 = new LibraryService();

    Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
      ls1.borrowBook(null, "123");
    });
    assertEquals("Invalid data", excepcion.getMessage());

  }

  @Test
  void PruebaPrestamoLibroSinUser() {
    LibraryService ls1 = new LibraryService();
    Book b1 = new Book("123", "prueba");
    ls1.addBook(b1);

    Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
      ls1.borrowBook("123", null);
    });
    assertEquals("Invalid data", excepcion.getMessage());

  }

  @Test
  void PruebaDevolverLibro() {
    LibraryService ls1 = new LibraryService();
    User u1 = new User("123", "anso");
    Book b1 = new Book("123", "libro prueba");
    Loan l1 = new Loan(b1, u1);
    l1.isActive();
    ls1.returnBook(l1);

  }

  @Test
  void PruebaDevolverLibroSinEstarActivoPrestamo() {
    LibraryService ls1 = new LibraryService();
    User u1 = new User("123", "anso");
    Book b1 = new Book("123", "libro prueba");
    Loan l1 = new Loan(b1, u1);
    l1.closeLoan();
    Exception excepcion = assertThrows(IllegalStateException.class, () -> {
      ls1.returnBook(l1);
    });
    assertEquals("Loan already closed", excepcion.getMessage());

  }

}
