package services

import models.GastoIngreso
import models.Categoria
import java.time.LocalDate
import java.time.Month

class ReporteService {

    fun generarReporteMensual(registros: List<GastoIngreso>, mes: Month, año: Int): Map<Categoria, Double> {
        return registros.filter {
            it.fecha.month == mes && it.fecha.year == año
        }.groupBy { it.categoria }
            .mapValues { entry -> entry.value.sumOf { it.monto } }
    }

    fun imprimirReporte(registroService: RegistroService, mes: Month, año: Int) {
        val registros = registroService.obtenerRegistros()
        val reporte = generarReporteMensual(registros, mes, año)

        println("Reporte de Gastos e Ingresos de $mes $año:")
        reporte.forEach { (categoria, total) ->
            println("${categoria.descripcion}: \$${total}")
        }
    }
}
