package com.example.ejercicio

import org.junit.Test

class EstudianteTest {

    @Test
    fun probarFiltroEstudiantes()
    {
        println("--------------------------------------")
        println("Los estudiantes de PDM: ")

        val ciclo01 = listOf(
            Estudiante("Michael", "001", "Programación de Dispositivos Móviles"),
            Estudiante("Silvia", "002", "Programación de Dispositivos Móviles"),
            Estudiante("Daniel", "003", "Análisis númerico 4")
        )

        val estudiantesMoviles = ciclo01.filter {
            it.asignatura == "Programación de Dispositivos Móviles"
        }
        println("--------------------------------------")

        estudiantesMoviles.forEach {
            println("Estudiante: ${it.nombre}")

        }
        println("--------------------------------------")
    }
}