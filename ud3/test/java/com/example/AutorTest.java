package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutorTest {

    @Test
    void constructorInicializaCorrectamente() {
        Autor autor = new Autor("Miguel de Cervantes", "Española", "1547-09-29");

        assertEquals("Miguel de Cervantes", autor.getNombre());
        assertEquals("Española", autor.getNacionalidad());
        assertEquals("1547-09-29", autor.getFechaNacimiento());
        assertNotNull(autor.getLibros());
        assertTrue(autor.getLibros().isEmpty());
    }
}
