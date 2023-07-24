fun main() {
    println("Hello World!")

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

fun testaCondicoes(saldo: Double){
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}