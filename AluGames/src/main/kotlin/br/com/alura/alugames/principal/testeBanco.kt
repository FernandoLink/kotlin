package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco
import br.com.alura.alugames.dados.JogosDAO
import br.com.alura.alugames.modelo.Jogo

fun main() {

    val jogo = Jogo("Dandara", "https://cdn.cloudflare.steamstatic.com/steam/apps/612390/header.jpg?t=1674055293", 9.99,"Um jogo de plataforma e ação com elementos de metroidvania, onde você controla a heroína Dandara em sua luta para libertar um mundo repleto de opressão e tirania.")

    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    //jogoDAO.adicionar(jogo)

    val jogoRecuperado = jogoDAO.recuperarPeloId(7)

    jogoDAO.apagar(7)

    val listaJogos: List<Jogo> = jogoDAO.getLista()
    println(listaJogos)

    manager.close()
}