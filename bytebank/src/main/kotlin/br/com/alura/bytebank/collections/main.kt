package br.com.alura.bytebank.collections

fun main() {
    val assistiramCursoAndroid = setOf("Link", "Valeria", "Luiza", "Henrique", "Alex", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbos.distinct())
}

