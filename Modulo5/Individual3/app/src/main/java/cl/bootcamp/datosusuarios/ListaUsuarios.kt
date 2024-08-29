package cl.bootcamp.datosusuarios

class List {

    private val usersList = mutableListOf<Users>()

    fun agregarUsuario(user: Users) {
        usersList.add(user)
    }

    fun eliminarUsuario(nameRemove: String) {
        val usuarioParaEliminar = usersList.find { it.name == nameRemove }
        if (usuarioParaEliminar != null) {
            usersList.remove(usuarioParaEliminar)
        } else {
            println("Usuario no encontrado: $nameRemove")
        }
    }

    fun mostrarLista() {
        if (usersList.isEmpty()) {
            println("La lista de usuarios está vacía.")
        } else {
            for (user in usersList) {
                user.mostrarDatos()
                println("---------------------------------")
            }
        }
    }
}

fun main() {
    val userListShow = List()

    val user1 = Users("Matias", 30, "Diseñador", null)
    val user2 = Users("Paula", 32, "Prevencionista", user1)
    val user3 = Users("Lucas", 25, "Desarrollador", null)
    val user4 = Users("Sofia", 28, "Marketing", null)
    val user5 = Users("Ana", 40, "Directora", user2)

    // Agregar 5 usuarios a la lista
    userListShow.agregarUsuario(user1)
    userListShow.agregarUsuario(user2)
    userListShow.agregarUsuario(user3)
    userListShow.agregarUsuario(user4)
    userListShow.agregarUsuario(user5)

    // Mostrar lista
    println("--------LISTA DE USUARIOS INICIAL--------")
    println("")
    userListShow.mostrarLista()

    // Eliminar un usuario
    userListShow.eliminarUsuario("Lucas")

    // Mostrar lista con los cambios
    println("--------NUEVA LISTA DE USUARIOS--------")
    println("")
    userListShow.mostrarLista()
}