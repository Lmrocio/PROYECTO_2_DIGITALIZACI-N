import services.RegistroService
import services.ReporteService
import java.time.LocalDate
import java.time.Month
import java.util.*

/**
 * Punto de entrada del sistema de Registro de Gastos Personales.
 *
 * Este programa permite al usuario registrar gastos o ingresos,
 * y generar reportes mensuales a partir de los datos registrados.
 *
 * Utiliza dos servicios:
 * - [RegistroService]: para registrar los movimientos financieros.
 * - [ReporteService]: para generar reportes agrupados por mes y año.
 */
fun main() {
    val registroService = RegistroService()
    val reporteService = ReporteService()


    val scanner = Scanner(System.`in`)

    println("Bienvenido al sistema de Registro de Gastos Personales")

    while (true) {
        println("\n¿Qué deseas hacer?")
        println("1. Registrar un gasto o ingreso")
        println("2. Ver reporte mensual")
        println("3. Salir")
        when (scanner.nextInt()) {
            1 -> {
                /**
                 * Registro de un nuevo movimiento financiero.
                 *
                 * Se solicita al usuario el monto, la categoría y la fecha
                 * para registrar el gasto o ingreso correspondiente.
                 */
                println("Ingresa el monto:")
                val monto = scanner.nextDouble()
                println("Ingresa la categoría (Alimentación, Transporte, Ocio, Vivienda, Salud, Otro):")
                val categoria = scanner.next()
                println("Ingresa la fecha (YYYY-MM-DD):")
                val fecha = LocalDate.parse(scanner.next())

                registroService.agregarRegistro(monto, categoria, fecha)
                println("Registro agregado con éxito.")
            }
            2 -> {
                /**
                 * Generación de un reporte mensual.
                 *
                 * Se solicita el mes y el año para mostrar los movimientos
                 * financieros correspondientes a ese periodo.
                 */
                println("Ingresa el mes (ej. JANUARY):")
                val mes = Month.valueOf(scanner.next().uppercase())
                println("Ingresa el año (ej. 2025):")
                val año = scanner.nextInt()

                reporteService.imprimirReporte(registroService, mes, año)
            }
            3 -> {
                // Salida del programa
                println("¡Hasta pronto!")
                break
            }
            else -> {
                // Opción no reconocida
                println("Opción no válida.")
            }
        }
    }
}
