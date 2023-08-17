package br.com.alura.bytebank.collections

fun testaCopia() {
    val banco = BancoDeNomes()
    banco.salva("Henrique")
    banco.salva("Link")
    banco.salva("Valéria")
    banco.salva("Luiza")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

public fun testeColecao() {
    val nomes: MutableList<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    nomes.add("Link")
    println(nomes)
    println(nomes.contains("Link"))
}