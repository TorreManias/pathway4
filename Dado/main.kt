fun main() {
    val miPrimerDado = Dado(6, "blanco")
    println("Tu dado de ${miPrimerDado.nLados} lados, ha sacado un ${miPrimerDado.tirarDados()}")

    val miSegundoDado = Dado(20, "blanco")
    println("Tu dado de ${miSegundoDado.nLados} lados, ha sacado un ${miSegundoDado.tirarDados()}")

    val miTercerDado = Dado(12, "amarillo")
    println("Tu dado ${miTercerDado.color} de ${miTercerDado.nLados} lados, ha sacado un ${miTercerDado.tirarDados()}")

    val miPrimeraMoneda = Moneda()
    println("La moneda cayó en: ${miPrimeraMoneda.tirarMoneda()}")
}

class Dado (val nLados : Int, val color : String) {
    fun tirarDados() : Int {
        return (1..nLados).random()
    }
}

class Moneda {
    fun tirarMoneda() : String {
        return when ((1..2).random()) {
            1 -> "Cara"
            else -> "Cruz"
        }
    }
}