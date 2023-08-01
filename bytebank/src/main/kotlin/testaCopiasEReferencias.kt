fun testaCopiasEReferencias(){
    val contaLink = ContaCorrente(titular = "Link", numero = 1234)
    contaLink.deposita(1000.0)
    println(contaLink.titular)

    val contaVal = ContaPoupanca(numero = 2345, titular = "Valéria")
    contaVal.deposita(2000.0)
    println(contaVal.titular)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    val contaLuiza = ContaCorrente("Luiza", 3456)
    val contaHenrique = ContaPoupanca("henrique", 6789)

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