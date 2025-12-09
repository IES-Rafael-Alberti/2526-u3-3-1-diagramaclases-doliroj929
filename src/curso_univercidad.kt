class Profesor(
    private val idEmpleado: String,
    private val nombreCompleto: String,
    private val email: String,
    private val departamento: String
) {
    fun darClase() {}

    fun prepararExamen() {}

    fun evaluarEstudiante() {}

    fun verCursosImpartidos(): List<Curso> = emptyList()
}



class Curso(
    private val codigo: String,
    private val nombre: String,
    private val descripcion: String,
    private val creditosECTS: Int,
    private val nivel: String
) {
    fun contarEstudiantes(): Int = 0
}



class Estudiante(
    private val numExpediente: String,
    private val nombreCompleto: String,
    private val email: String,
    private val fechaPrimeraMatricula: String
) {
    fun asistirClase() {}

    fun estudiar() {}

    fun presentarseAExamen() {}
}



class Matricula(
    private val fechaMatricula: String,
    private val nota: Double
)