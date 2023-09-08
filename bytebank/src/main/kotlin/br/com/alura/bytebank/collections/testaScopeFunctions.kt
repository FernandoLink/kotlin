package br.com.alura.bytebank.collections

import br.com.alura.bytebank.modelo.Endereco
import java.util.*

public fun testaScopeFunctions() {
    Endereco(logradouro = "rua vergueiro", numero = 3185).apply {
        "${logradouro}, ${numero}".uppercase(Locale.getDefault())
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

    soma(1, 5) {
        println(it)
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

