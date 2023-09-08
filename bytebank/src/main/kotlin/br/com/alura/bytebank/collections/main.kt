package br.com.alura.bytebank.collections

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import java.util.*

fun main() {
    somaReceiver(1, 5, resultado = (::println))
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val total = a + b
    total.resultado()
}
