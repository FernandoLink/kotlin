package br.com.alura.bytebank.lists

fun main() {
    listaLivrosComNulos.imprimeComMarcadores()

    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach { (editora, livros) -> println("$editora: ${livros.joinToString { it.titulo }}")}

}