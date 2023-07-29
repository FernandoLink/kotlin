fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Link", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Valeria", numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("Saldo da conta corrente: ${contaCorrente.saldo}")
    println("Saldo da conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("Saldo da conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo da conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo da conta corrente após transferência: ${contaCorrente.saldo}")
    println("Saldo da conta poupança após transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo da conta corrente após transferência: ${contaCorrente.saldo}")
    println("Saldo da conta poupança após transferência: ${contaPoupanca.saldo}")
}