fun main() {
//    println("Hello World!")
//    testaLacos()
    testaCopiasEReferencias()

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set
    fun deposita(valor: Double){
        if(valor>0) {
            saldo += valor
        }
    }

    fun saca(valor: Double){
        if(saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias(){
    val contaLink = Conta()
    contaLink.titular = "Link"
    contaLink.numero = 1234
    contaLink.deposita(1000.0)
    println(contaLink.titular)

    val contaVal = Conta()
    contaVal.titular = "Valéria"
    contaVal.numero = 2345
    contaVal.deposita(2000.0)
    println(contaVal.titular)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    val contaLuiza = Conta()
    contaLuiza.titular = "Luiza"
    val contaHenrique = Conta()
    contaHenrique.titular = "Henrique"

    println("contaLuiza: ${contaLuiza.titular}")
    println("contaHenrique: ${contaHenrique.titular}")

    println("Depositando na conta da Luiza")
    contaLuiza.deposita(500.0)
    println(contaLuiza.saldo)

    println("Sacando na conta da Luiza")
    contaLuiza.saca(50.0)
    println(contaLuiza.saldo)

    println("Transferência")
    if(contaLuiza.transfere(50.0, contaHenrique)){
        println(contaLuiza.saldo)
        println(contaHenrique.saldo)
    }
}

fun testaCondicoes(saldo: Double){
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

fun testaLacos() {
    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }
        val titular = "Fernando Link $i"
        val numeroConta: Int = 1000 + i
        val saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo da Conta: $saldo")
        testaCondicoes(saldo)
    }
}