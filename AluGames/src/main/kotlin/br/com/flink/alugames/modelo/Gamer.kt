package br.com.flink.alugames.modelo

data class Gamer(var nome:String, var email:String) {
    private var dataNascimento:String? = null
    private var usuario:String? = null
    val idInterno:String? = null

    //código omitido

    constructor(nome: String, email: String, dataNascimento:String, usuario:String):
            this(nome, email) {
        this.dataNascimento = dataNascimento
        this.usuario = usuario
    }

    override fun toString(): String {
        return "Gamer(nome='$nome', email='$email', dataNascimento=$dataNascimento, usuario=$usuario, idInterno=$idInterno)"
    }


}