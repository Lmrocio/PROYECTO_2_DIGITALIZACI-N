package services

import models.GastoIngreso
import models.Categoria
import java.time.LocalDate
import java.time.Month

/**
 * Servicio encargado de generar y mostrar reportes mensuales de gastos e ingresos.
 *
 * Esta clase proporciona métodos para generar un reporte de los registros de gasto o ingreso
 * de un mes y año específicos, y para imprimir dicho reporte en consola.
 */
class ReporteService {

    /**
     * Genera un reporte mensual de gastos e ingresos agrupados por categoría.
     *
     * Este método filtra los registros según el mes y año especificados, luego agrupa los registros por
     * categoría y calcula la suma de los montos para cada categoría.
     *
     * @param registros La lista de registros de gastos e ingresos.
     * @param mes El mes del que se desea generar el reporte.
     * @param año El año del que se desea generar el reporte.
     * @return Un mapa que asocia cada categoría de gasto o ingreso con el total acumulado para esa categoría.
     */
    fun generarReporteMensual(registros: List<GastoIngreso>, mes: Month, año: Int): Map<Categoria, Double> {
        return registros.filter {
            it.fecha.month == mes && it.fecha.year == año
        }.groupBy { it.categoria }
            .mapValues { entry -> entry.value.sumOf { it.monto } }
    }

    /**
     * Imprime un reporte de gastos e ingresos mensuales en consola.
     *
     * Este método obtiene los registros desde el [RegistroService], genera un reporte mensual y lo
     * imprime en consola, mostrando el total por cada categoría.
     *
     * @param registroService El servicio que gestiona los registros de gastos e ingresos.
     * @param mes El mes del que se desea imprimir el reporte.
     * @param año El año del que se desea imprimir el reporte.
     */
    fun imprimirReporte(registroService: RegistroService, mes: Month, año: Int) {
        val registros = registroService.obtenerRegistros()
        val reporte = generarReporteMensual(registros, mes, año)

        println("Reporte de Gastos e Ingresos de $mes $año:")
        reporte.forEach { (categoria, total) ->
            println("${categoria.descripcion}: \$${total}")
        }
    }
}
