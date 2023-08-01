fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Fernando Link",
        cpf = "111.222.333-44",
        salario = 1000.0,
        senha = 1000
    )
    val diretor = Diretor(
        nome = "Fernando Link",
        cpf = "111.222.333-44",
        salario = 1000.0,
        senha = 1000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Valeria Link",
        cpf = "111.222.333-44",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
}

