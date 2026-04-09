package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestContaBancaria {
    
    @Test
    void testConstructorPorDefecto(){
        ContaBancaria conta = new ContaBancaria();
        assertEquals(conta.getTitular(), "Descoñecido");
        assertEquals(conta.getSaldo(), 0.0);
        assertEquals(conta.getNumeroOperacions(), 0.0);
    }

    @Test 
    void testIngresarMasCero(){
        ContaBancaria conta1 = new ContaBancaria();
        conta1.ingresar(5);
        assertEquals(conta1.getSaldo(), 5);
        conta1.ingresar(10);
        assertEquals(conta1.getSaldo(), 15);
        assertEquals(conta1.getNumeroOperacions(), 2);
    }

    @Test
    void testIngresarMenosCero(){
        ContaBancaria conta2 = new ContaBancaria();
        conta2.ingresar(-3);
        assertEquals(conta2.getSaldo(), 0);
        assertEquals(conta2.getNumeroOperacions(), 1);
    }


    @Test
    void testRetirarSaldoPositivo(){
        ContaBancaria conta3 = new ContaBancaria();
        conta3.ingresar(20);
        assertEquals(conta3.getSaldo(), 20);
        conta3.retirar(10);
        assertEquals(conta3.getSaldo(), 10);
        assertEquals(conta3.getNumeroOperacions(), 2);
        assertTrue(true);
    }



}
