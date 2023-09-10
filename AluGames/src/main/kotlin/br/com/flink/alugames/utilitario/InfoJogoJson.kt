package br.com.flink.alugames.utilitario

import br.com.flink.alugames.modelo.InfoJogoJson
import br.com.flink.alugames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}