// Clase lógica
class Calculadora {
    fun sumar(a: Double, b: Double) = a + b
    fun restar(a: Double, b: Double) = a - b
    fun multiplicar(a: Double, b: Double) = a * b
    fun dividir(a: Double, b: Double): Double? = if (b != 0.0) a / b else null
}

// Clase presentación
fun main() {
    val calc = Calculadora()
    print("Introduce el primer número: ")
    val a = readLine()?.toDoubleOrNull() ?: return println("Número inválido")
    print("Introduce el segundo número: ")
    val b = readLine()?.toDoubleOrNull() ?: return println("Número inválido")

    println("Suma: ${calc.sumar(a, b)}")
    println("Resta: ${calc.restar(a, b)}")
    println("Multiplicación: ${calc.multiplicar(a, b)}")
    println("División: ${calc.dividir(a, b) ?: "No se puede dividir por cero"}")
}