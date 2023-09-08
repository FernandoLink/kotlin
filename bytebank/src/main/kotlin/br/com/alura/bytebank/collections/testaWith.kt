package br.com.alura.bytebank.collections

import br.com.alura.bytebank.modelo.Endereco

fun testeWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "82900-150"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String -> println(enderecoCompleto) }
}
