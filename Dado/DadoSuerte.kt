fun main(){
    val miPrimerDado = Dado(6)
    val tiroResultado = miPrimerDado.tirarDados()
    val numeroSuerte = 4

    when (tiroResultado) {
        numeroSuerte -> println("Ganaste!")
        else -> println("Perdiste. Tiraste un ${tiroResultado}. Intenta de nuevo.")
    }
}

class Dado (val nLados : Int) {
    fun tirarDados() : Int {
        return (1..nLados).random()
    }
}