package cl.bootcamp.datosusuarios

class Users(
    private var name: String,
    private var age: Int,
    private var job: String?,
    private var reference: Users?
) {
    fun mostrarDatos() {

        val jobNull = job ?: "------"
        val referenceNull = reference?.name ?: "------"

        println("Nombre: $name. \nEdad: $age. \nTrabajo: $jobNull. \nReferenciado por: $referenceNull.")
    }

}



fun main() {

    val user1 = Users ("Matias", 30, "Diseñador", null )
    val user2 = Users ("Paula", 32, "Prevencionista de riesgos", user1)
    user1.mostrarDatos()
    println("------------------------")
    user2.mostrarDatos()

}