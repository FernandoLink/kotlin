package br.com.alura.bytebank.collections

import java.lang.NullPointerException
import br.com.alura.bytebank.collections.testaSet

fun main() {
    println(soma(1,5))

    val minhaFuncao = ::soma2
    println(minhaFuncao(1, 2))

    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())

    val teste = Teste()
    teste(10)

    val minhaFuncaoLambda= {
        println("Executa com lambada")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun(){
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
}
fun soma(a: Int, b: Int) : Int = a + b

fun soma2(a: Int, b: Int): Int{
    return a + b
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do teste")
    }
    operator fun invoke(valor: Int){
        println(valor)
    }

}