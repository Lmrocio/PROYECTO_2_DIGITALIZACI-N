import models.Categoria
import services.RegistroService
import services.ReporteService
import java.time.LocalDate
import java.time.Month
import java.util.*

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
                println("Ingresa el mes (ej. JANUARY):")
                val mes = Month.valueOf(scanner.next().uppercase())
                println("Ingresa el año (ej. 2025):")
                val año = scanner.nextInt()

                reporteService.imprimirReporte(registroService, mes, año)
            }
            3 -> {
                println("¡Hasta pronto!")
                break
            }
            else -> {
                println("Opción no válida.")
            }
        }
    }
}
