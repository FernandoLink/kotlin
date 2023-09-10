package br.com.flink.alugames.utilitario

import br.com.flink.alugames.modelo.Gamer
import br.com.flink.alugames.modelo.InfoGamerJson

fun InfoGamerJson.criaGamer(): Gamer {
    return Gamer(
        this.nome,
        this.email,
        this.dataNascimento,
        this.usuario)
}