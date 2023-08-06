package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaFuncionarios
import br.com.alura.bytebank.teste.testaObjects

fun main() {

    val endereco = Endereco(logradouro = "Rua Vergueiro", complemento = "Alura")

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

}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}
