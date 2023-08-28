package br.com.alura.bytebank.collections

public fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 60.0,
        5 to 150.0,
        6 to 80.0
    )

    println(pedidos.keys)
    for (numero in pedidos.keys) {
        println("Pedido ${numero}")
    }

    println(pedidos.values)
    for (valor in pedidos.values) {
        println("Valores ${valor}")
    }

    println(pedidos.get(5))
    //println(pedidos.getValue(5))
    println(pedidos.getOrElse(0, {
        "não tem o pedido"
    }))

    println(pedidos.getOrDefault(0, -1.0))

    val pedidosFiltrados = pedidos.filter { (n, v) -> n % 2 == 0 && v > 50 }
    println(pedidosFiltrados)

    println(pedidos.filterKeys { n -> n > 3 })
    println(pedidos.filterValues { v -> v > 70.0 })

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(8 to 100.0, 9 to 20.0))
    println(pedidos + (10 to 150.0))

    println(pedidos - 1)
    println(pedidos - listOf(1, 2, 3))

    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0))
    pedidos += listOf(9 to 10.0)
    println(pedidos)

    pedidos.remove(9)
    pedidos.keys.remove(8)
    pedidos.values.remove(20.0)
    pedidos -= 2
    println(pedidos)
}

