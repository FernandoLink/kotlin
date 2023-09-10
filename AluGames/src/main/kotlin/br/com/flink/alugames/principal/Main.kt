package br.com.flink.alugames.principal

import br.com.flink.alugames.modelo.Gamer
import br.com.flink.alugames.modelo.Jogo
import br.com.flink.alugames.servicos.ConsumoApi
import transformarEmIdade
import java.util.*

fun main(args: Array<String>){
    val leitura = Scanner(System.`in`)
    val gamer = Gamer.criarGamer(leitura)
    println("Cadastro concluído com sucesso. Dados do gamer:")
    println(gamer)
    println("Idade do gamer: " + gamer.dataNascimento?.transformarEmIdade())

    do {
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
            gamer.jogosBuscados.add(meuJogo)
        }
        println("Deseja buscar um novo jogo? (S/N) ")
        val resposta = leitura.nextLine()
    } while(resposta.equals("s", true))
    println("Jogos buscados: ")
    println(gamer.jogosBuscados)
    println("Jogos ordenados por título:")
    gamer.jogosBuscados.sortBy {
        it?.titulo
    }
    gamer.jogosBuscados.forEach {
        println("Título: ${it?.titulo}")
    }
    val jogosFiltrados = gamer.jogosBuscados.filter {
        it?.titulo?.contains("batman", true) ?: false
    }
    println("\n Jogos filtrados: ")
    println(jogosFiltrados)
    println("Deseja excluir algum jogo da lista original? S/N")
    val opcao = leitura.nextLine()
    if (opcao.equals("s", true)) {
        println(gamer.jogosBuscados)
        println("\n Informe a posição do jogo que deseja excluir: ")
        val posicao = leitura.nextInt()
        gamer.jogosBuscados.removeAt(posicao)
    }
    println("Lista Atualizada:")
    println(gamer.jogosBuscados)
    println("Busca finalizada com sucesso!")
}