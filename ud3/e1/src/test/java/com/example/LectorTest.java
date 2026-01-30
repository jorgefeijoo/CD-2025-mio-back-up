package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LectorTest {

    @Test
    void constructorInicializaCorrectamente() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        assertEquals(101, lector.getNumSocio());
        assertEquals("Ana", lector.getNombre());
        assertEquals("Pérez López", lector.getApellidos());
        assertEquals("Rúa Real 12", lector.getDireccion());
    }

    @Test
    void comprobarMultasPendientesPorDefectoFalse() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        assertFalse(lector.comprobarMultasPendientes());
    }

    @Test
    void pódenseModificarCamposPublicos() {
        Lector lector = new Lector(101, "Ana", "Pérez López", "Rúa Real 12");

        lector.setNumSocio(202);
        lector.setNombre("Brais");
        lector.setApellidos("García");
        lector.setDireccion("Av. de Galicia 5");

        assertEquals(202, lector.getNumSocio());
        assertEquals("Brais", lector.getNombre());
        assertEquals("García", lector.getApellidos());
        assertEquals("Av. de Galicia 5", lector.direccion);
    }
}