package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestXestorNotas {

    @Test
    void TestProbarConstructor() {
        XestorNotas xes = new XestorNotas("Jorge", new double[] { 7.5, 5.0, 8.2, 9.0 });
        assertEquals("Jorge", xes.getAlumno());

        assertArrayEquals(new double[] { 7.5, 5.0, 8.2, 9.0 }, xes.getNotas(), 0.001);

    }

    @Test
    void TestCalcularMediaSinNotas() {
        XestorNotas xes = new XestorNotas();
        double[] notas = new double[0];
        xes.setAlumno("Jorge");
        assertEquals(0, xes.calcularMedia());
        assertEquals("Jorge", xes.getAlumno());
    }

    @Test
    void TestCalcularMedia() {
        XestorNotas xes = new XestorNotas();
        double[] notas = { 1, 2, 3, 4, 5 };
        xes.setNotas(notas);
        assertEquals(3, xes.calcularMedia());
    }

    @Test
    void testCalcularMaximoValoresPositivos() {
        double[] notas = { 5.5, 8.0, 9.2, 4.0, 7.1 };
        XestorNotas xes = new XestorNotas();
        xes.setNotas(notas);

        assertEquals(9.2, xes.calcularMaximo());
    }

    @Test
    void testCalcularMaximoArrayVacio() {
        double[] notas = {};
        XestorNotas xes = new XestorNotas();
        xes.setNotas(notas);

        assertEquals(0.0, xes.calcularMaximo());
    }

    @Test
    void testEstaAprobadoConMediaMayorACinco() {
        double[] notas = { 5.5, 8.0, 9.2, 4.0, 7.1 };
        XestorNotas xes = new XestorNotas();
        xes.setNotas(notas);
        xes.calcularMedia();
        assertTrue(xes.estaAprobado());

    }

    @Test
    void TestEstaAprobadoMenorACinco() {
        XestorNotas xes = new XestorNotas();
        double[] notas = { 1, 2, 3, 4, 5 };
        xes.setNotas(notas);
        xes.calcularMedia();
        assertFalse(xes.estaAprobado());

    }

    @Test
    void testContarSuspensosConVariosSuspensos() {
        XestorNotas xes = new XestorNotas();
        double[] notas = { 4.5, 5.0, 3.2, 8.0, 2.0 };
        xes.setNotas(notas);
        assertEquals(3, xes.contarSuspensos());
    }

    @Test
    void testContarSuspensosArrayVacio() {
        XestorNotas xes = new XestorNotas();

        double[] notas = {};
        xes.setNotas(notas);
        assertEquals(0, xes.contarSuspensos());
    }

}
