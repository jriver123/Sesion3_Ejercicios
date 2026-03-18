class Bus(
    val numeroRuta: String,
    val capacidad: Int,
    val conductor: String
) {
    fun iniciarRuta() {
        println(" El bus de la Ruta $numeroRuta, conducido por $conductor, ha iniciado su recorrido.")
        println("   Capacidad máxima: $capacidad pasajeros.")
        println("---------------------------------------------------------")
    }
}

fun main() {
    // 1. Crear 2 objetos Bus
    val bus1 = Bus("114", 60, "Don Juan Pérez")
    val bus2 = Bus("MR4", 45, "Ramón Rodríguez")

    println("--- Monitoreo de Transporte Municipal ---")
    bus1.iniciarRuta()
    bus2.iniciarRuta()
}