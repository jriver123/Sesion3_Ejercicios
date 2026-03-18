class Libro(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) {
    fun mostrarInformacion() {
        println("  Título: $titulo")
        println("   Autor:  $autor")
        println("   Año:    $anioPublicacion")
        println("----------------------------------------------")
    }
}

fun main() {
    // 1. Registrar 4 libros de tecnología/programación
    val libro1 = Libro("Clean Code", "Robert C. Martin", 2008)
    val libro2 = Libro("Kotlin in Action", "Dmitry Jemerov", 2017)
    val libro3 = Libro("The Pragmatic Programmer", "Andrew Hunt", 1999)
    val libro4 = Libro("Introduction to Algorithms", "Thomas H. Cormen", 2009)

    // 2. Mostrar la información de los libros registrados
    println("---  Registro de Biblioteca Universitaria ---")
    libro1.mostrarInformacion()
    libro2.mostrarInformacion()
    libro3.mostrarInformacion()
    libro4.mostrarInformacion()
}