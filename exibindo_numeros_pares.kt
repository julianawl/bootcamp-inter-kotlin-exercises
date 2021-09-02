//Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    
    for (i in 2.until(n+1).step(2)){
        println(i)
    } 
}