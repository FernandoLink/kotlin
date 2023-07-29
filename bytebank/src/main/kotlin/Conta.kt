open class Conta(
    val titular: String,
    val numero: Int = 0
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        if(valor>0) {
            saldo += valor
        }
    }

    open fun saca(valor: Double){
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