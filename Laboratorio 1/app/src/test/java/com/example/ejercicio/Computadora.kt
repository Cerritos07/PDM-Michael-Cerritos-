package com.example.ejercicio

/*REALIZO CLASE PARA COMPUTADORA*/
class Computadora
    (
    //coloco atributos de la computadora.
    var sistemaOperativo: String,
    var ram: Int,
    var almacenamiento: Int
)

//
{
    var encendida: Boolean = false
    var programasInstalados: MutableList<String> = mutableListOf()

    fun encender()
    {
        encendida = true
        println("Computadora encendida")
    }

    fun apagar()
    {
        encendida = false
        println("Computadora apagada")
    }

    fun actualizarRAM(nuevaRAM: Int)
    {
        ram = nuevaRAM
    }

    fun actualizarAlmacenamiento(nuevoEspacio: Int)
    {
        almacenamiento = nuevoEspacio
    }

    fun cambiarSistemaOperativo(nuevoSO: String)
    {
        sistemaOperativo = nuevoSO
    }

    fun agregarPrograma(programa: String)
    {
        programasInstalados.add(programa)
    }

    fun programasDelAnio(anio: String): List<String>
    {
        return programasInstalados.filter { it.contains(anio) }
    }
}