package com.example;

/**
 * Clase que representa una cuenta bancaria.
 * Permite gestionar el titular de la cuenta, el saldo actual y llevar un
 * registro del número de operaciones realizadas tambien puede calcular y aplicar comisiones basadas en la actividad.
 */
public class ContaBancaria {

    /** El nombre del titular de la cuenta bancaria. */
    private String titular;
    
    /** El saldo actual disponible en la cuenta. */
    private double saldo;
    
    /** El número total de operaciones realizadas. */
    private int numeroOperacions;

    /**
     * Constructor por defecto.
     * Inicializa el titular como "Descoñecido", el saldo a 0.0 y las operaciones a 0.
     */
    public ContaBancaria() {
        this.titular = "Descoñecido";
        this.saldo = 0.0;
        this.numeroOperacions = 0;
    }

    /**
     * Constructor parametrizado.
     * * @param titular      El nombre del titular de la cuenta.
     * @param saldoInicial El saldo inicial con el que se abre la cuenta.
     */
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroOperacions = 0;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * * @return El titular actual de la cuenta.
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Establece o modifica el nombre del titular de la cuenta.
     * * @param titular El nuevo nombre del titular.
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * * @return El saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el número de operaciones registradas en la cuenta.
     * * @return La cantidad de ingresos y retiradas válidas efectuadas.
     */
    public int getNumeroOperacions() {
        return numeroOperacions;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * que solo se realiza si es  mayor que cero. 
     * Si es válido, incrementa el saldo y el contador de operaciones.
     * * @param cantidade La cantidad de dinero a ingresar.
     */
    public void ingresar(double cantidade) {
        if (cantidade > 0) {
            saldo += cantidade;
            numeroOperacions++;
        }
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     * Solo se realiza si la cantidad es mayor que cero y existe saldo 
     * suficiente en la cuenta para cubrir la retirada.
     * Si es válido, reduce el saldo y aumenta el contador de operaciones.
     * * @param cantidade La cantidad de dinero que se desea retirar.
     * @return {@code true} si la retirada se realizó con éxito, {@code false} si no hay saldo suficiente o la cantidad es inválida.
     */
    public boolean retirar(double cantidade) {
        if (cantidade > 0 && saldo >= cantidade) {
            saldo -= cantidade;
            numeroOperacions++;
            return true;
        }
        return false;
    }

    /**
     * Calcula la comisión aplicable según el número de operaciones realizadas en la cuenta.
     * 
     * Menos de 5 operaciones: Sin comisión (0).
     * Entre 5 y 10 operaciones : 1% sobre el saldo actual.
     * Más de 10 operaciones: 2% sobre el saldo actual.
     * 
     * * @return El importe exacto de la comisión calculada.
     */
    public double calcularComision() {
        if (numeroOperacions < 5) {
            return 0;
        } else if (numeroOperacions <= 10) {
            return saldo * 0.01;
        } else {
            return saldo * 0.02;
        }
    }

    /**
     * Aplica la comisión correspondiente al saldo de la cuenta.
     * Resta el valor obtenido a través del método {@link #calcularComision()} 
     * directamente del saldo actual.
     */
    public void aplicarComision() {
        double comision = calcularComision();
        saldo -= comision;
    }
}