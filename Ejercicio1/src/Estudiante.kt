// Definición de la clase con sus atributos en el constructor
class Estudiante(
    val nombre: String,
    val carnet: String,
    val carrera: String,
    val anio: Int // Usamos Int para números (ej. 1, 2, 3)
) {
    fun mostrarDatos() {
        println("--- Datos del Estudiante ---")
        println("Nombre:  $nombre")
        println("Carnet:  $carnet")
        println("Carrera: $carrera")
        println("Año:     $anio")
        println("----------------------------")
    }
}

// Función principal para ejecutar el programa
fun main() {
    // 1. Crear al menos 3 objetos Estudiante
    val estudiante1 = Estudiante("Jonathan Rivera", "2023-501J", "Ingeniería en Sistemas", 2)
    val estudiante2 = Estudiante("Kenneth Acuna", "2024-044S", "Ingeniería en Sistemas", 1)
    val estudiante3 = Estudiante("María Morales", "2021-083M", "Ingeniería en Sistemas", 4)

    estudiante1.mostrarDatos()
    estudiante2.mostrarDatos()
    estudiante3.mostrarDatos()
}