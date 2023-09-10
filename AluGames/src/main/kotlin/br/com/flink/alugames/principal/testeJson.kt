package br.com.flink.alugames.principal

import br.com.flink.alugames.modelo.Periodo
import br.com.flink.alugames.servicos.ConsumoApi
import java.time.LocalDate

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()

    val gamerCaroline = listaGamers.get(3)
    val jogoResidenteVillage = listaJogoJson.get(10)
    val jogo2 = listaJogoJson.get(13)
    val jogo3 = listaJogoJson.get(2)

    val periodo1 = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    val periodo2 = Periodo(LocalDate.now(), LocalDate.now().plusDays(3))
    val periodo3 = Periodo(LocalDate.now(), LocalDate.now().plusDays(10))

    gamerCaroline.alugaJogo(jogoResidenteVillage, periodo1)
    gamerCaroline.alugaJogo(jogo2, periodo2)
    gamerCaroline.alugaJogo(jogo3, periodo3)

    println(gamerCaroline.jogosAlugados)

}