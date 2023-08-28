package br.com.alura.bytebank.collections

public fun testaMap() {
    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    pedidos[4] = 70.0
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)
    pedidos.remove(6)
    pedidos.remove(3, 50.0)
    println(pedidos)

    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }

    for (p in pedidos) {
        println("Numero do pedido: ${p.key} com valor ${p.value}")
    }
}