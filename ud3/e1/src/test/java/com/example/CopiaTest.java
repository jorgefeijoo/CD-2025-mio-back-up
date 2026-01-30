package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CopiaTest {

    @Test
    void prestar_establece_estado_prestado() {
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia("C001", libro);

        copia.prestar();

        assertEquals("prestado", copia.getEstado());
    }

    @Test
    void devolver_establece_estado_disponible() {
        String identificador = "C001";
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia(identificador, libro);
        copia.devolver();

        assertEquals("disponible", copia.getEstado());
    }

    @Test
    void prestar_y_devolver_cambia_el_estado_correctamente() {
        Libro libro = new Libro("O Señor dos Aneis", "Fantasía", "Minotauro", 1954);
        Copia copia = new Copia("C001", libro);

        copia.prestar();
        assertEquals("prestado", copia.getEstado());

        copia.devolver();
        assertEquals("disponible", copia.getEstado());
    }
}