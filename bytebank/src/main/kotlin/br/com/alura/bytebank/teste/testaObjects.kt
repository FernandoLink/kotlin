package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import java.lang.String as StringJava

public fun testaObjects() {
    val palavra: String = "Fernando"
    val palavraJava: StringJava = StringJava("Valeria")

    println(palavra)
    println(palavraJava)

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("nome do cliente ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    val link = Cliente(nome = "Link", cpf = "816.289.279-68", senha = 1234)
    val contaPoupanca = ContaPoupanca(titular = link, numero = 1000)
    val contaCorrente = ContaCorrente(titular = link, numero = 1001)

    testaAutenticacao()
    testaContasDiferentes()

    println("Total de Contas: ${Conta.total}")
}