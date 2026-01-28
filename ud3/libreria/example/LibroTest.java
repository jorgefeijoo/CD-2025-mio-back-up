package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void constructorDebeInicializarCorrectamenteLosAtributos() {
        // Arrange
        String nome = "O Señor dos Aneis";
        String tipo = "Fantasía";
        String editorial = "Minotauro";
        int ano = 1954;

        // Act
        Libro libro = new Libro(nome, tipo, editorial, ano);

        // Assert
        assertEquals(nome, libro.getNome());
        assertEquals(tipo, libro.getTipo());
        assertEquals(editorial, libro.getEditorial());
        assertEquals(ano, libro.getAno());
        assertNotNull(libro.getAutores());
        assertTrue(libro.getAutores().isEmpty());
    }
}
