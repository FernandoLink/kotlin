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