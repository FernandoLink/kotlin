package br.com.flink.alugames.modelo

data class Jogo(val titulo:String, val capa:String) {
    var descricao:String? = null
    override fun toString(): String {
        return """
            Meu Jogo: 
                Título: $titulo 
                Capa: $capa 
                Descricao: $descricao
                """
    }


}