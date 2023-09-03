package br.com.alura.bytebank.collections

public fun testaLambda() {
    println(soma(1, 5))

    val minhaFuncao = ::soma2
    println(minhaFuncao(1, 2))

    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())

    val teste = Teste()
    teste(10)

    val minhaExpressaoLambda = { a: Int, b: Int -> a + b }
    println(minhaExpressaoLambda(15, 20))

    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int { return a + b }
    println(minhaFuncaoAnonima(15, 20))

    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculadoraBonificacao(12000.0))

    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(12000.0))
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