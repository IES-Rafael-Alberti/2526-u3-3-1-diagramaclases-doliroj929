class Empleado(
    private val nombreCompleto: String,
    private val fechaNacimiento: String, // Usamos String para Date
    private val sueldoBruto: Double,     // Usamos Double para Decimal
    private val esResponsable: Boolean
) {
    fun calcularEdad(): Int = 0

    fun calcularSueldoNeto(): Double = 0.0

    fun verSubordinados() {}
}



class Cliente(
    private val nombreCompleto: String,
    private val fechaNacimiento: String, // Usamos String para Date
    private val telefono: String
) {
    fun calcularEdad(): Int = 0
}


class Empresa(
    private val nombreCorporativo: String,
    private val cif: String,
    private val direccionFiscal: String
) {

}