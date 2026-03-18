data class Pedido(
    val cliente: String,
    val platillo: String,
    val precio: Double
)

fun main() {
    // 2. Crear 3 pedidos de la fritanga
    val pedido1 = Pedido("Jonathan Rivera", "Gallo Pinto con Carne Asada", 150.0)
    val pedido2 = Pedido("María Morales", "Tajadas con Queso", 80.0)
    val pedido3 = Pedido("Ricardo Dario", "Taoos", 95.0)

    // 3. Mostrar los pedidos en consola
    println("---  Comandas de la fritanga 'Tere' ---")
    println(pedido1)
    println(pedido2)
    println(pedido3)

    // Opcional: Mostrar un resumen de ingresos
    val total = pedido1.precio + pedido2.precio + pedido3.precio
    println("--------------------------------------------------")
    println("Total de ventas del momento: C$ $total")
}