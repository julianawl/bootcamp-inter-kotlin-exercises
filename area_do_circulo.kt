//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este 
//problema que π = 3.14159:
//Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
    
    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = (raio * raio) * pi
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    println("A=$resultado")
    
}