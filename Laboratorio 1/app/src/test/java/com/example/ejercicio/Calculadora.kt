package com.example.ejercicio

/*REALIZO CLASE PARA CALCULADORA*/
class Calculadora
    (
    //coloco atributos de la calculadora.
        val aniosVida: Int,
        var precio: Double,
        val marca: String
    )

//

{
    fun sumar(a: Double, b: Double): Double
    {
        return a + b
    }

    fun restar(a: Double, b: Double): Double
    {
        return a - b
    }

    fun multiplicar(a: Double, b: Double): Double
    {
        return a * b
    }

    fun dividir(a: Double, b: Double): Double
    {
        if (b == 0.0) {
            println("Error: No se puede dividir entre 0")
            return 0.0
        }
        return a / b
    }
}