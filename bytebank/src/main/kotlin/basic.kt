fun main() {
    val link = Funcionario(
        "Fernando Link",
        cpf = "816.289.279-68",
        salario = 12000.0
    )

    println("\nNome: ${link.nome}")
    println("CPF: ${link.cpf}")
    println("Salário: ${link.salario}")
    println("Bonificação: ${link.bonificacao}")

    val valeria = Gerente(
        nome = "Valéria Link",
        cpf = "123.456.789.-10",
        salario = 2000.0,
        senha = 1234
    )
    println("\nNome: ${valeria.nome}")
    println("CPF: ${valeria.cpf}")
    println("Salário: ${valeria.salario}")
    println("Bonificação: ${valeria.bonificacao}")

    val henrique = Diretor(
        nome = "Henrique Link",
        cpf = "123.456.789.-10",
        salario = 20000.0,
        senha = 1234,
        plr = 4000.0
    )
    println("\nNome: ${henrique.nome}")
    println("CPF: ${henrique.cpf}")
    println("Salário: ${henrique.salario}")
    println("Bonificação: ${henrique.bonificacao}")
    println("PLR: ${henrique.plr}")
}