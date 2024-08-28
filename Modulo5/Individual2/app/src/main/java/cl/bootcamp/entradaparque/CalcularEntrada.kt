package cl.bootcamp.entradaparque

fun main() {
    val age = 18
    val day = "martes"

    if (age < 0 || age > 100) {
        println("Error: Edad no válida. La edad debe estar entre 0 y 100 años.")
        return
    }

    val price = when {

        age < 4 -> 0
        age in 5..15 -> 15000
        age in 16..60 -> {
            val basePrice = 30000
            val discount = if (day === "lunes" || day === "martes") 5000
            else 0
            basePrice - discount
        }
        age in 61..100 -> 20000
        else -> {
            println("No paga entrada")
            return
        }
    }

    if (age < 0 || age > 100) {
        println("Error: Edad no válida. La edad debe estar entre 0 y 100 años.")
    }



    println("Debe pagar $price CLP")
}
