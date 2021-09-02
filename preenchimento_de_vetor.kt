//Você recebeu o desafio de ler um valor e criar um programa que coloque o valor lido na primeira 
//posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição 
//anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim 
//sucessivamente. Mostre o vetor em seguida.

fun main(args: Array<String>) {

    val valor = readLine()!!.toInt()
    val vetor = IntArray(10).toMutableList()
    
    vetor[0] = valor
    println("N[0] = ${vetor[0]}")
    
    for ( i in 1..(vetor.size-1) ) { 
      vetor[i] = vetor[i-1] * 2 
      println("N[$i] = ${vetor[i]}")
    }
}