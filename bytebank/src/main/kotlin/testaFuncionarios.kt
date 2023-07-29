fun testaFuncionarios() {
    val link = Diretor(
        "Fernando Link",
        cpf = "816.289.279-68",
        salario = 12000.0,
        senha = 123,
        plr = 10000.0
    )
    println("\nNome: ${link.nome}")
    println("CPF: ${link.cpf}")
    println("Salário: ${link.salario}")
    println("Bonificação: ${link.bonificacao}")
    println("PLR: ${link.plr}")

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

    val henrique = Analista(
        nome = "Henrique Link",
        cpf = "123.456.789.-10",
        salario = 20000.0,
    )
    println("\nNome: ${henrique.nome}")
    println("CPF: ${henrique.cpf}")
    println("Salário: ${henrique.salario}")
    println("Bonificação: ${henrique.bonificacao}")

    val luiza = Analista(
        nome = "Luiza Link",
        cpf = "111.111.111.11",
        salario = 30000.0,
    )
    println("\nNome: ${luiza.nome}")
    println("CPF: ${luiza.cpf}")
    println("Salário: ${luiza.salario}")
    println("Bonificação: ${luiza.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(link)
    calculadora.registra(valeria)
    calculadora.registra(henrique)
    calculadora.registra(luiza)
    println("\nTotal de bonificacao: ${calculadora.total}")
}
