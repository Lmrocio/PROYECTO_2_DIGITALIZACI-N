package services

import models.GastoIngreso
import java.time.LocalDate

class RegistroService {
    private val registros = mutableListOf<GastoIngreso>()

    fun agregarRegistro(monto: Double, categoria: String, fecha: LocalDate) {
        val categoriaEnum = try {
            models.Categoria.valueOf(categoria.uppercase())
        } catch (e: IllegalArgumentException) {
            models.Categoria.OTRO
        }
        val nuevoRegistro = GastoIngreso(monto, categoriaEnum, fecha)
        registros.add(nuevoRegistro)
    }

    fun eliminarRegistro(registro: GastoIngreso) {
        registros.remove(registro)
    }

    fun obtenerRegistros(): List<GastoIngreso> = registros
}
