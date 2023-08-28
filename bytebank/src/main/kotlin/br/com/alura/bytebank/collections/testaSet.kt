package br.com.alura.bytebank.collections

public fun testaSet() {
    val assistiramCursoAndroid: Set<String> =
        mutableSetOf("Link", "Valeria", "Luiza", "Henrique", "Alex", "Maria", "Alex")
    val assistiramCursoKotlin: Set<String> = mutableSetOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Fernando")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
}