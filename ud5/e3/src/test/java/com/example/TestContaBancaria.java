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
        assertEquals(0,conta2.getNumeroOperacions());
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
    
    @Test
    void testRetirarSaldoNegativo(){
        ContaBancaria conta4 = new ContaBancaria();
        conta4.retirar(10);
        conta4.ingresar(0);
        assertEquals(conta4.getSaldo(), 0);
        assertEquals(0,conta4.getNumeroOperacions());
    }

    @Test
    void testCalcularComisionMenorCinco(){
        ContaBancaria conta5 = new ContaBancaria();
        assertEquals(0, conta5.calcularComision());
    }

    @Test
    void testCalcularComisionDiez(){
        ContaBancaria conta6 = new ContaBancaria();
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        conta6.ingresar(1);
        assertEquals(conta6.getNumeroOperacions(), 10);
        assertEquals(10*0.01,conta6.calcularComision());
    }

    @Test
    void testCalcularComisionEntreCincoYDiez(){
        ContaBancaria conta7= new ContaBancaria();
        conta7.ingresar(1);
        conta7.ingresar(1);
        conta7.ingresar(1);
        conta7.ingresar(1);
        conta7.ingresar(1);
        conta7.ingresar(1);
        assertEquals(conta7.getNumeroOperacions(), 6);
        assertEquals(6*0.01,conta7.calcularComision() );
    }


    @Test
    void testNumeroOperacionesMayorDiez(){
        ContaBancaria conta8 = new ContaBancaria();
    conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
       conta8.ingresar(1);
        assertEquals(conta8.getNumeroOperacions(), 12);
        assertEquals(12*0.02,conta8.calcularComision());
    }

    @Test 
    void testAplicarComision(){
        ContaBancaria conta9 = new ContaBancaria();
        conta9.ingresar(10);
        conta9.ingresar(10);
        conta9.ingresar(10);
        conta9.ingresar(10);
        conta9.ingresar(10);
        assertEquals(50*0.01, conta9.calcularComision());
        conta9.aplicarComision();
        assertEquals(50-50*0.01,conta9.getSaldo());
    }

  




}
