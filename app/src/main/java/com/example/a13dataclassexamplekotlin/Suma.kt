package com.example.a13dataclassexamplekotlin

import java.text.NumberFormat
import java.util.Locale
import kotlin.math.ceil

fun main() {

    var result = sum(5.3, 4.6F)
    println("El resultado de la suma de un double y un float es $result")

    result = round(4.5)
    println("El double redondeado hacia arriba es: $result")

    val currency = showResult(100.8)
    println("El doble ingresado transformado a moneda es: $currency")

}

// Función para sumar un double y un float.
fun sum(double: Double, float: Float) : Double = double + float

// Función para redondear un double hacia arriba.
fun round(double: Double) = ceil(double)

// Función para transformar un double a un string en formato de moneda.
fun showResult(double: Double): String {

    val doubleToCurrency: NumberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN)
    return doubleToCurrency.format(double)

}

