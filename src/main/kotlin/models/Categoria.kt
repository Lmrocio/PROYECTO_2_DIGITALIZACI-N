package models

/**
 * Representa las categorías disponibles para clasificar gastos o ingresos.
 *
 * Cada categoría tiene una descripción en texto legible para mostrar al usuario.
 *
 * @property descripcion Descripción legible de la categoría.
 */
enum class Categoria(val descripcion: String) {
    /** Gastos relacionados con la alimentación, como comida o supermercados. */
    ALIMENTACION("Alimentación"),

    /** Gastos de transporte, como autobús, gasolina o taxis. */
    TRANSPORTE("Transporte"),

    /** Gastos relacionados con el ocio, como entretenimiento o hobbies. */
    OCIO("Ocio"),

    /** Gastos del hogar, como alquiler, hipoteca o servicios básicos. */
    VIVIENDA("Vivienda"),

    /** Gastos relacionados con la salud, como medicamentos o consultas médicas. */
    SALUD("Salud"),

    /** Categoría genérica para gastos o ingresos que no encajan en las anteriores. */
    OTRO("Otro")
}
