package services

import models.GastoIngreso
import java.time.LocalDate

/**
 * Servicio encargado de gestionar los registros de gastos e ingresos.
 *
 * Esta clase permite agregar y eliminar registros de gastos o ingresos, así como obtener la lista
 * de todos los registros almacenados en el sistema.
 *
 * @constructor Crea una instancia de [RegistroService] con una lista vacía de registros.
 */
class RegistroService {
    private val registros = mutableListOf()<GastoIngreso>()

    /**
     * Agrega un nuevo registro de gasto o ingreso.
     *
     * Este método permite agregar un nuevo gasto o ingreso al sistema. Si la categoría proporcionada
     * no es válida, se asignará la categoría 'Otro' por defecto.
     *
     * @param monto El monto del gasto o ingreso. Debe ser un número positivo.
     * @param categoria La categoría del gasto o ingreso, como "Alimentación", "Transporte", etc.
     * @param fecha La fecha en la que ocurrió el gasto o ingreso.
     */
    fun agregarRegistro(monto: Double, categoria: String, fecha: LocalDate) {
        val categoriaEnum = try {
            models.Categoria.valueOf(categoria.uppercase())
        } catch (e: IllegalArgumentException) {
            models.Categoria.OTRO
        }
        val nuevoRegistro = GastoIngreso(monto, categoriaEnum, fecha)
        registros.add(nuevoRegistro)
    }

    /**
     * Elimina un registro de gasto o ingreso.
     *
     * Este método elimina un registro específico de la lista de registros almacenados.
     *
     * @param registro El objeto [GastoIngreso] que se desea eliminar.
     */
    fun eliminarRegistro(registro: GastoIngreso) {
        registros.remove(registro)
    }

    /**
     * Obtiene la lista de todos los registros de gasto o ingreso.
     *
     * @return Una lista de objetos [GastoIngreso] que contiene todos los registros almacenados.
     */
    fun obtenerRegistros(): List<GastoIngreso> = registros
}
