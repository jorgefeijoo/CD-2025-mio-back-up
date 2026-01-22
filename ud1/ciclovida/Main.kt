fun main() {
    val calc = Calculadora()

    println("Calculadora en Kotlin")
    print("Introduce o primeiro número: ")
    val num1 = readLine()?.toDoubleOrNull()
    if (num1 == null) {
        println("Entrada non válida.")
        return
    }

    print("Introduce o segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()
    if (num2 == null) {
        println("Entrada non válida.")
        return
    }

    println("Escolle operación: + para suma, - para resta, * para multiplicación, / para división")
    val operacion = readLine()

    val resultado = when (operacion) {
        "+" -> calc.sumar(num1, num2)
        "-" -> calc.restar(num1, num2)
        "*" -> calc.multiplicar(num1, num2)
        "/" -> try {
            calc.dividir(num1, num2)
        } catch (e: IllegalArgumentException) {
            println("${e.message}")
            return
        }
        else -> {
            println("Operación non recoñecida.")
            return
        }
    }

    println("Resultado: $resultado")
}