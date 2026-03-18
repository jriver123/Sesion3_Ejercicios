class CuentaBancaria(
    val numeroCuenta: String,
    private var saldo: Double = 0.0 // 'private' impide que se modifique desde fuera
) {

    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println(" Depósito exitoso de C$ $monto en la cuenta $numeroCuenta")
        } else {
            println(" El monto a depositar debe ser mayor a 0")
        }
    }

    fun retirar(monto: Double) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto
            println(" Retiro exitoso de C$ $monto")
        } else if (monto > saldo) {
            println(" Fondos insuficientes para retirar C$ $monto")
        } else {
            println(" Monto no válido")
        }
    }

    fun consultarSaldo() {
        println(" Saldo actual de la cuenta $numeroCuenta: C$ $saldo")
        println("-----------------------------------------------------")
    }
}

fun main() {
    // 1. Crear la cuenta
    val miCuenta = CuentaBancaria("8388-4949-20", 500.0)

    // 2. Operaciones bancarias
    miCuenta.consultarSaldo()

    miCuenta.depositar(1200.0) // Subirá a 1700
    miCuenta.retirar(300.0)    // Bajará a 1400

    miCuenta.consultarSaldo()

    miCuenta.retirar(5000.0)

}