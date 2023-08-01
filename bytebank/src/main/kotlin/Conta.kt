abstract class Conta(
    val titular: String,
    val numero: Int = 0
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double){
        if(valor>0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}