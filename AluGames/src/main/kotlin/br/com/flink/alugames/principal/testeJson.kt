package br.com.flink.alugames.principal

import br.com.flink.alugames.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()

    val gamerCaroline = listaGamers.get(3)
    val jogoResidenteVillage = listaJogoJson.get(10)

    println(gamerCaroline)
    println(jogoResidenteVillage)

    val aluguel = gamerCaroline.alugaJogo(jogoResidenteVillage)

    println(aluguel)

}