package cl.bootcamp.cuentabancaria

class CuentaBancaria(val nombreCuenta: String, var saldoDisponible: Double) {
    private val historialTransacciones = mutableListOf<String>()

    fun deposito(monto: Double) {
        saldoDisponible += monto
        historialTransacciones.add("$nombreCuenta depositó \$$monto")
    }

    fun retiro(monto: Double) {
        if (monto <= saldoDisponible) {
            saldoDisponible -= monto
            historialTransacciones.add("$nombreCuenta retiró \$$monto")
        } else {
            historialTransacciones.add("$nombreCuenta intentó retirar \$$monto pero no tiene suficiente saldo")
        }
    }

    fun mostrarSaldo(): Double {
        return saldoDisponible
    }

    fun mostrarHistorial() {
        println("------HISTORIAL DE TRANSACCIONES - $nombreCuenta-----")
        println("")
        historialTransacciones.forEach { println(it) }
        println("")
        println("Su saldo disponible es de: \$$saldoDisponible")
        println("------------------------------------------------------")
        println("")

    }
}
