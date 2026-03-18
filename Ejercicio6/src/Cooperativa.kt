class Taxi(
    val placa: String,
    val conductor: String,
    val modelo: String
) {
    fun iniciarServicio() {
        println(" El taxi $modelo [Placa: $placa], conducido por $conductor, ha iniciado turno en Granada.")
    }
}

fun main() {
    // 1. Crear 3 objetos Taxi
    val taxi1 = Taxi("GR-1024", "Jonathan Rivera", "Toyota Fortuner")
    val taxi2 = Taxi("GR-5582", "Manuel Jiron", "Chevrolet Spark")
    val taxi3 = Taxi("GR-9011", "Alejandra Villalobos", "Kia Picanto")

    println("--- Registro de Salida de Cooperativa ---")
    taxi1.iniciarServicio()
    taxi2.iniciarServicio()
    taxi3.iniciarServicio()
    println("-----------------------------------------")
}