package com.example;

import java.math.BigInteger;

/**
 * Clase que proporciona la lógica para calcular el factorial de un número.
 */
public class Factorial {

    /**
     * Calcula el factorial de un número entero positivo
     * * @param n el número entero del cual se desea calcular el factorial.
     * 
     * @return el resultado del factorial de n.
     * @throws Exception si el número proporcionado es negativo, ya que no se puede
     *                   hacer con numeros negativos.
     */
    public BigInteger factorial(int n) throws Exception {
        // Validamos que el número no sea negativo
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        // Inicializamos el resultado a 1 (el factorial de 0 y 1 es 1)
        BigInteger resultado = BigInteger.ONE;

        // Multiplicamos iterativamente desde 2 hasta n
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}