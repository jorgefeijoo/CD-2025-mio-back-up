package com.example;

import java.math.BigInteger;

/**
 * Creamos la clase fibonacci que comprueba si la operacion es correcta
 */
public class Fibonacci {

    /**
     * 
     * @param n
     * @return
     * @throws Exception si el numero es negativo devuelve una excepcion porque
     *                   fibonacci solo se puede hacer con numeros positivos
     */
    public BigInteger fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        /**
         * si n es 0 devuelve 0
         */
        if (n == 0) {
            return BigInteger.ZERO;
        }

        /**
         * si n es 1 devuelve 1
         */
        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger anterior = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;
        BigInteger resultado = BigInteger.ZERO;

        /**
         * A partir del 2 el resultado sera la suma del valor del anterior mas el actual
         */
        for (int i = 2; i <= n; i++) {
            resultado = anterior.add(actual);
            anterior = actual;
            actual = resultado;
        }

        return actual;
    }
}