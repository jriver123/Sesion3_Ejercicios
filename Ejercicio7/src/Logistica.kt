
interface Vehiculo {
    fun mover() // Método sin implementar
}

// 2. Clase Camion implementando la interfaz
class Camion(val modelo: String) : Vehiculo {
    override fun mover() {
        println(" El camión $modelo está transportando carga pesada por la carretera hacia SJ.")
    }
}

// 3. Clase Motocicleta implementando la interfaz
class Motocicleta(val marca: String) : Vehiculo {
    override fun mover() {
        println(" La motocicleta $marca está entregando un pedido rápido por la calle del Periodista.")
    }
}

fun main() {
    // 4. Crear los objetos
    val miCamion = Camion("Mercedes")
    val miMoto = Motocicleta("Yamaha")

    // 5. Ejecutar el método común
    println("--- Reporte de Movimientos Logísticos ---")
    miCamion.mover()
    miMoto.mover()
}