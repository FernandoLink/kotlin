class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    ): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao get() = salario * 0.1
}