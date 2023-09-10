package br.com.flink.alugames.principal

import br.com.flink.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer(
        "Fernando Link",
        "fernandolink@gmail.com"
    )
    val gamer2 = Gamer(
        "Fernando Link",
        "fernandolink@gmail.com",
        "22/04/1970",
        "flink"
    )

    gamer1.let {
        it.dataNascimento = "22/04/1970"
        it.usuario = "flink"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    println(gamer2)
}