package com.example.ejercicio

import org.junit.Test
class ComputadoraTest
{
    @Test
    fun probarComputadora()
    {
        println("--------------------------------------")
        println("Los resultados obtenidos son: ")

        val pc = Computadora("Windows", 256, 8)

        pc.encender()
        pc.agregarPrograma("Notion 2026")
        pc.agregarPrograma("Facebook 2024")
        pc.agregarPrograma("Chrome 2023")

        val programas2026 = pc.programasDelAnio("2026")

        println("Programas del 2026:")
        programas2026.forEach {
            println(it)
        }
        pc.apagar()
        println("--------------------------------------")
    }
}