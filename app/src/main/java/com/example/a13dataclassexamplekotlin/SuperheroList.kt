package com.example.a13dataclassexamplekotlin

// Creación de data class con los atributos.
data class SuperheroList(
    val superhero: String,
    val publisher: String,
    val realName: String,
    val photo: String,
) {}

fun main() {

    // Creación de variable y llamado a la funcíón para llenar listado
    val superheroList = setDataList()

    // Llamado a función para mostrar los datos del listado.
    getData(superheroList)

}

// Función para llenado del listado.
private fun setDataList() : List<SuperheroList> {

    val superheroes = mutableListOf<SuperheroList>()

    while (true) {
        println("Ingrese los datos del superhéroe (o 'SALIR' para terminar):")
        print("Superhéroe: ")
        val superhero = readLine()?.trim()

        // Condición para salir del ciclo.
        if (superhero.equals("SALIR", ignoreCase = true)) break

        print("Editorial: ")
        val publisher = readLine()?.trim()

        print("Nombre real: ")
        val realName = readLine()?.trim()

        print("Foto: ")
        val photo = readLine()?.trim()

        val newSuperheroe = SuperheroList(superhero!!, publisher!!, realName!!, photo!!)
        superheroes.add(newSuperheroe)

        println("Superhéroe ingresado exitosamente.\n")
    }
   return superheroes
}

// Función para mostrar datos ingresados.
fun getData(superheroes: List<SuperheroList>) {
    println("\n*** Superhéroes ingresados ***")
    println("--------------------")
    for (superhero in superheroes) {
        println("Superhéroe: ${superhero.superhero}")
        println("Editorial: ${superhero.publisher}")
        println("Nombre real: ${superhero.realName}")
        println("Foto: ${superhero.photo}")
        println("--------------------")
    }
}
