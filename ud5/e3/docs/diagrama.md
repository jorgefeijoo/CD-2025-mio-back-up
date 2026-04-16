```mermaid 
classDiagram
    class XestorNotas {
        -String alumno
        -double[] notas
        +XestorNotas()
        +XestorNotas(String alumno, double[] notas)
        +calcularMedia() 
        +calcularMaximo() 
        +estaAprobado() 
        +contarSuspensos()
    }

    class ContaBancaria {
        -String titular
        -double saldo
        -int numeroOperacions
        +ContaBancaria()
        +ContaBancaria(String titular, double saldoInicial)
        +getTitular() 
        +ingresar(double cantidade) 
        +retirar(double cantidade) 
        +calcularComision() 
        +aplicarComision() 
    }

    ```