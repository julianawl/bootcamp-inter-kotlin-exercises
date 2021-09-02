//Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do
//vetor X por 1. Em seguida mostre o vetor X.

fun main(args: Array<String>) {
    
    val list = IntArray(10) { readLine()!!.toInt() }
    for ( i in 0..(list.size-1) ) { 
        if (list[i]<=0) {
          list[i] = 1 
        } else {
          continue
        }
    }
    for ( x in 0..(list.size-1)) println("X[$x] = ${list[x]}")
    
}