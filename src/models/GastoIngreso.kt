package models

import java.time.LocalDate

data class GastoIngreso(
    val monto: Double,
    val categoria: Categoria,
    val fecha: LocalDate
) {
    init {
        require(monto > 0) { "El monto debe ser positivo." }
    }
}
