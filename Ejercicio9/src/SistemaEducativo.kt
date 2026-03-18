open class Persona(
    val nombre: String,
    val edad: Int
) {
    open fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}

// 2. Clase Hija: Docente (Agregamos el atributo 'materia')
class Docente(
    nombre: String,
    edad: Int,
    val materia: String
) : Persona(nombre, edad) {

    override fun presentarse() {
        println("Soy el profesor $nombre, tengo $edad años y dicto la materia de $materia.")
    }
}

// 3. Clase Hija: Estudiante (Agregamos el atributo 'promedio')
class EstudianteUniversitario(
    nombre: String,
    edad: Int,
    val promedio: Double
) : Persona(nombre, edad) {

    override fun presentarse() {
        println(" Soy el estudiante $nombre, tengo $edad años y mi promedio es $promedio.")
    }
}

fun main() {
    // 4. Crear los objetos
    val profesor = Docente("Ing. Jonathan Paz", 32, "Programación II")
    val alumno = EstudianteUniversitario("Kenneth Acuña", 20, 92.5)

    // 5. Ejecutar los métodos
    println("--- Registro Académico ---")
    profesor.presentarse()
    alumno.presentarse()
}