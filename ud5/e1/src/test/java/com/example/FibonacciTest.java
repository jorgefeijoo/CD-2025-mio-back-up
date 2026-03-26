package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class FibonacciTest{
   
    @Test
    void factorialDeNumeroNegativo() {
        Fibonacci f = new Fibonacci();

        Exception exception = assertThrows(Exception.class, () -> {
            f.fibonacci(-1);
        });

        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }

    @Test
    void factorialDeCero() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ZERO, f.fibonacci(0));
    }


    @Test
    void factorialDeUno() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ONE, f.fibonacci(1));
    }


     @Test
    void factorialDeDos() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(2), f.fibonacci(3));
    }

     @Test
    void factorialDeCinco() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(5), f.fibonacci(5));
    }


}