//Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma
//operação deve ser realizada, um caractere maiúsculo, indicando a operação que será realizada, e 
//todos os elementos de uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos 
//elementos que estão na área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso 
//da entrada do valor 5 para a coluna da matriz, demonstrando os elementos que deverão ser 
//considerados na operação.

fun main(args: Array<String>) {
    
    val C = readLine()!!.toInt()
    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12)}
    
    for (i in 0.until(12)) {
        var line = readLine()!!
        if (line.contains(" ")) {
            M[i] = line.split(" ").map(fun (it: String): Double { return it.replace(",", ".").toDouble(); }).toDoubleArray();
        }
        else {
            M[i][0] = line.toDouble()
            for (j in 1.until(12)) {
                M[i][j] = readLine()!!.toDouble()
            }
        }
    }
    for (k in 0.until(M.size)) {
        sum += M[k][C]
    }
    if (T == "M") sum /= M.size
    
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this).replace(',','.')