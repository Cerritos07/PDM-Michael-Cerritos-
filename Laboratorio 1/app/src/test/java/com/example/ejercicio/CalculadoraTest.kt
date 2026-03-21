package com.example.ejercicio
import org.junit.Test

class CalculadoraTest
{

    @Test
    fun probarCalculadora()
    {
        println("--------------------------------------")
        println("Los resultados obtenidos son: ")

        val calc = Calculadora(5, 28.50, "Casio")

        println("Suma: ${calc.sumar(5.0, 3.0)}")
        println("Resta: ${calc.restar(5.0, 3.0)}")
        println("Multiplicación: ${calc.multiplicar(5.0, 3.0)}")
        println("División: ${calc.dividir(5.0, 3.0)}")

        println("División entre 0: ${calc.dividir(5.0, 0.0)}")
        println("--------------------------------------")
    }
}