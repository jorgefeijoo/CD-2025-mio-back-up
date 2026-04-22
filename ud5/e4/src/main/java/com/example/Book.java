package com.example;

/**
 * Deja ver si estan disponibles si se puede prestar o si se
 * puede devolver
 */
public class Book {

    private String isbn;
    private String title;
    private boolean available;

    /**
     * 
     * Creas un libro con un isbn y un titulo
     * 
     * @param isbn  el isbn del libro
     * @param title el titulo del libro
     */
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.available = true;
    }

    /**
     * Obtiene el valor del isbn
     * 
     * @return valor del isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Obtiene el valor del titulo
     * 
     * @return devuleve el valor del titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Devuelve true si esta disponible o false si no lo esta
     * 
     * @return devuelve el si esta disponible o no
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Pasa a estar no disponible pero si no esta disponible muestra un mensaje de
     * error
     * 
     * @throws IllegalStateException si no esta disponible el libro
     */
    public void borrow() {
        if (!available) {
            throw new IllegalStateException("Book not available");
        }
        available = false;
    }

    /**
     * Devuelve un libro donde lo vuelve a poner disponible
     */
    public void giveBack() {
        available = true;
    }
}