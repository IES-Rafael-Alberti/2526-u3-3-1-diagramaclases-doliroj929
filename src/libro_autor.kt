class Autor(
    private val nombre: String,
    private val apellido: String,
    private val nacionalidad: String,
    private val fechaNacimiento: String
) {
    fun escribir() {}

    fun getNombreCompleto(): String = ""
}


class Libro(
    private val titulo: String,
    private val isbn: String,
    private val numeroPaginas: Int,
    private val precio: Double
) {

    fun leer() {}


    fun getTitulo(): String = ""


    fun getPrecio(): Double = 0.0
}