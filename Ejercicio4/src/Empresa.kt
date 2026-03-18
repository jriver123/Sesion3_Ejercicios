open class Empleado(
    val nombre: String,
    val salario: Double
) {
    open fun mostrarDetalles() {
        println("Empleado: $nombre | Salario: C$ $salario")
    }
}

// 2. Clase Hija (Hereda de Empleado usando ':')
class Programador(
    nombre: String,
    salario: Double,
    val lenguaje: String // Atributo propio de esta clase
) : Empleado(nombre, salario) {

    override fun mostrarDetalles() {
        println("--- Perfil del Programador ---")
        println("Nombre:   $nombre")
        println("Salario:  C$ $salario")
        println("Lenguaje: $lenguaje")
        println("------------------------------")
    }
}

fun main() {
    // 3. Crear un objeto Programador
    val prog1 = Programador("Jonathan Rivera", 35000.0, "Kotlin")
    val prog2 = Programador("Maria Morales", 32000.0, "Java")

    // 4. Mostrar información
    prog1.mostrarDetalles()
    prog2.mostrarDetalles()
}