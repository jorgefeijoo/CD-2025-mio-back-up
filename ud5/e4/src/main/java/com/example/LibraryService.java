package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Biblioteca que te deja añadir un nuevo libro añadir un nuevo usuario te deja
 * hacer el prestamo de un libro y devolver un libro
 */
public class LibraryService {

    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    /**
     * Añade un libro , si este libro ya existe manda un mensaje de error
     * 
     * @param book un libro que se desea registrar en la biblioteca
     * @throws IllegalArgumentException si ya existe ese libro en la biblioteca
     */
    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("Book already exists");
        }
        books.put(book.getIsbn(), book);
    }

    /**
     * Añade un usuario si ese usuario ya existe muestra un mensaje de error
     * 
     * @param user un usuario que se desea registrar
     * @throws IllegalArgumentException si ese usuario ya esta registrado
     */
    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        users.put(user.getId(), user);
    }

    /**
     * Prestamo de un libro a un usuario si no existe un libro o no existe un
     * usuario muestra un mensaje de error
     * 
     * @param isbn   el isbn de un libro que se va a prestar
     * @param userId el id de un usuario que va a pedir un prestamo
     * @return El registro del prestamo creado
     * @throws IllegalArgumentException Si el libro o el usuario no existen
     */
    public Loan borrowBook(String isbn, String userId) {
        Book book = books.get(isbn);
        User user = users.get(userId);

        if (book == null || user == null) {
            throw new IllegalArgumentException("Invalid data");
        }

        book.borrow();

        Loan loan = new Loan(book, user);
        user.addLoan(loan);

        return loan;
    }

    /**
     * Metodo para devolver un libro donde si ese prestamo no esta activo muestra un
     * mensaje de error
     * 
     * @param loan el registro de un prestamo que se desea cerrar
     * @throws IllegalStateException si el prestamo no esta activo
     */
    public void returnBook(Loan loan) {
        if (!loan.isActive()) {
            throw new IllegalStateException("Loan already closed");
        }

        loan.closeLoan();
        loan.getBook().giveBack();
        loan.getUser().removeLoan(loan);
    }
}