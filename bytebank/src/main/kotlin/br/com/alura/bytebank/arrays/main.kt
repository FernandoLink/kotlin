package br.com.alura.bytebank.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 53, 16)
    idades.forEach { idade -> println(idade) }
    println(idades.contentToString())
    println(idades.max())
    println(idades.min())
    println(idades.average())
    println(idades.all { it >= 18 })
    println(idades.any { it <= 18 })
    println(idades.filter { it >= 18})
    println(idades.find { it >= 50})
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Int.SIZE_BITS)
    println(Int.SIZE_BYTES)

    val salarios: DoubleArray = doubleArrayOf(10000.0, 11000.0, 12000.0, 16000.0)
    for(indice in salarios.indices){
        salarios[indice] += salarios[indice] * 0.1
    }
    println(salarios.contentToString())
    salarios.forEachIndexed() { i, salario -> salarios[i] += salario * 0.1}
    println(salarios.contentToString())

    val contatos = arrayOf("Roberto", "Ana", "Paula")

    var serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }

    println()
    var numerosPares = 2..100 step 2
    for(par in numerosPares){
        print("$par ")
    }

    println()
    numerosPares = 2.until(100) step 2
    for(par in numerosPares){
        print("$par ")
    }

    println()
    val reverso = 100 downTo 0 step 5
    reverso.forEach{ print("$it ")}

    println()
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo){
        println(true)
    } else {
        println(false)
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    if(letra in alfabeto){
        println(true)
    } else {
        println(false)
    }

    val sal = bigDecimalArrayOf("16000.0", "20000.0", "30000.0")
    println(sal.contentToString())
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = sal.map { salario -> (salario * aumento).setScale(2, RoundingMode.UP) }.toTypedArray()
    println(salariosComAumento.contentToString())


}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
}