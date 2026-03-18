
data class Producto(
    val nombre: String,
    val precio: Double,
    val cantidad: Int
)

fun main() {
    // 2. Crear los 5 productos comunes de la pulpería
    val p1 = Producto("Arroz (libra)", 22.0, 50)
    val p2 = Producto("Papas (libra)", 30.0, 40)
    val p3 = Producto("Azúcar (libra)", 15.5, 30)
    val p4 = Producto("Agua (litro)", 65.0, 12)
    val p5 = Producto("Jabón", 25.0, 20)

    // 3. Mostrar los productos en consola
    println("--- Inventario de la Pulpería ---")
    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p5)

    println("\nNota: El precio del ${p2.nombre} es C$ ${p2.precio}")
}