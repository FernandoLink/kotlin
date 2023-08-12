package br.com.alura.bytebank.lists

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}