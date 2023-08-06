package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaEqualsHashCode() {
    val endereco = Endereco(logradouro = "Rua Dom Joao Vi", complemento = "Sobrado 4", cep = "82900-150")
    val enderecoNovo = Endereco(logradouro = "Rua Dom Joao Vi", complemento = "Sobrado 4", cep = "82900-150")

    imprime2(1)
    imprime2(1.0)
    imprime2(true)
    imprime2("teste")
    val teste = imprime2(endereco)
    println(teste)
    imprime2(Unit)
    imprime2(Any())

    testaFuncionarios()

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
}

fun imprime2(valor: Any) : Any{
    println(valor)
    return valor
}
