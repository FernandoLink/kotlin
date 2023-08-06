package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaFuncionarios
import br.com.alura.bytebank.teste.testaObjects

fun main() {

    val endereco = Endereco(logradouro = "Rua Dom Joao Vi", complemento = "Sobrado 4", cep = "82900-150")
    val enderecoNovo = Endereco(logradouro = "Rua Dom Joao Vi", complemento = "Sobrado 4", cep = "82900-150")

    imprime(1)
    imprime(1.0)
    imprime(true)
    imprime("teste")
    val teste = imprime(endereco)
    println(teste)
    imprime(Unit)
    imprime(Any())

    testaFuncionarios()

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())


}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}
