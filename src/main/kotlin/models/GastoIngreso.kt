package models

import java.time.LocalDate

/**
 * Representa un gasto o ingreso registrado con su monto, categoría y fecha.
 *
 * Esta clase es utilizada para almacenar los detalles de un gasto o ingreso dentro del sistema.
 *
 * @property monto El monto del gasto o ingreso. Debe ser positivo.
 * @property categoria La categoría en la que se clasifica el gasto o ingreso, como alimentación, transporte, etc.
 * @property fecha La fecha en la que ocurrió el gasto o ingreso.
 *
 * @throws IllegalArgumentException Si el monto es menor o igual a cero.
 */
data class GastoIngreso(
    val monto: Double,
    val categoria: Categoria,
    val fecha: LocalDate
) {
    init {
        require(monto > 0) { "El monto debe ser positivo." }
    }
}
