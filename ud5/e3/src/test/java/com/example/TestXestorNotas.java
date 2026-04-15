package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestXestorNotas {
    @Test
    void TestCalcularMediaSinNotas() {
        XestorNotas xes = new XestorNotas();
        double[] notas = new double[0];
        assertEquals(0, xes.calcularMedia());
    }

    @Test
    void TestCalcularMedia() {
        XestorNotas xes = new XestorNotas();
        double[] notas = { 1, 2, 3, 4, 5 };
        xes.setNotas(notas);
        assertEquals(3, xes.calcularMedia());
    }

    class XestorNotasTest {

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
            // Tenemos 3 suspensos (4.5, 3.2 y 2.0) y 2 aprobados
            double[] notas = { 4.5, 5.0, 3.2, 8.0, 2.0 };
            xes.setNotas(notas);

            // Esperamos que el contador devuelva exactamente 3
            assertEquals(3, xes.contarSuspensos());
        }

        @Test
        void testContarSuspensosSinNingunSuspenso() {
            XestorNotas xes = new XestorNotas();
            // Todos están aprobados, incluyendo el caso límite del 5.0
            double[] notas = { 5.0, 6.5, 9.0, 10.0 };
            xes.setNotas(notas);

            // Esperamos que devuelva 0
            assertEquals(0, xes.contarSuspensos());
        }

        @Test
        void testContarSuspensosTodosSuspensos() {
            XestorNotas xes = new XestorNotas();
            // Todos los alumnos han suspendido, incluyendo un 4.9 (casi aprobado)
            double[] notas = { 1.0, 4.9, 3.5 };
            xes.setNotas(notas);

            // Esperamos que cuente los 3
            assertEquals(3, xes.contarSuspensos());
        }

        @Test
        void testContarSuspensosArrayVacio() {
            XestorNotas xes = new XestorNotas();
            // No hay notas registradas
            double[] notas = {};
            xes.setNotas(notas);

            // Al no entrar al bucle for, el contador debe quedarse en 0
            assertEquals(0, xes.contarSuspensos());
        }
    }

}
