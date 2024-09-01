package cl.bootcamp.cuentabancaria

fun main() {
    val cuenta1 = CuentaBancaria("Camila", 2000.0)
    val cuenta2 = CuentaBancaria("Felipe", 500.0)
    val cuenta3 = CuentaBancaria("Alexadra", 1500.0)

    cuenta1.deposito(400.0)
    cuenta1.retiro(3000.0)
    cuenta1.deposito(1200.0)
    cuenta1.deposito(500.0)
    cuenta1.retiro(2600.0)

    // Transacciones en la cuenta de Felipe
    cuenta2.deposito(100.0)
    cuenta2.retiro(200.0)
    cuenta2.deposito(300.0)
    cuenta2.retiro(100.0)
    cuenta2.deposito(150.0)

    // Transacciones en la cuenta de Alexandra
    cuenta3.deposito(500.0)
    cuenta3.retiro(200.5)
    cuenta3.deposito(1000.0)
    cuenta3.retiro(200.0)
    cuenta3.retiro(500.0)

    // Mostrar el historial y saldo de cada cuenta
    cuenta1.mostrarHistorial()
    cuenta2.mostrarHistorial()
    cuenta3.mostrarHistorial()
}
