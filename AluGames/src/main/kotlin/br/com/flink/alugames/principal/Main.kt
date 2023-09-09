package br.com.flink.alugames.principal

import br.com.flink.alugames.modelo.Jogo
import br.com.flink.alugames.servicos.ConsumoApi
import java.util.*

fun main(args: Array<String>){
    val leitura = Scanner(System.`in`)
    println("Digite o código de jogo para buscar: ")
    val busca = leitura.nextLine()

    var meuJogo: Jogo? = null

    val resultado = runCatching {
        val buscaApi = ConsumoApi()
        val meuInfoJogo = buscaApi.buscaJogo(busca)
        meuJogo = Jogo(meuInfoJogo.info.title, meuInfoJogo.info.thumb)
    }
    resultado.onFailure { println("Jogo inexistente. Tente outro id.") }
    resultado.onSuccess {
        println("Deseja inserir uma descrição personalizada? (S/N)")
        val opcao = leitura.nextLine()
        if(opcao.equals("s", true)){
            println("Insira a descrição personalizada para o jogo: ")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo.toString()
        }
        println(meuJogo)
    }
}