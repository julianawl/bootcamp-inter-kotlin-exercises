//Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
//Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos 
//que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

fun main(args: Array<String>) {
    
    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }
    
    for (i in 0..M.size-1) {
        for (j in 0..M.size-1) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    
    for (i in 0..M.size-2) {
        for (j in (i+1)..M.size-1) {
          sum += M[i][j] 
        }
    }
    
    if (T == "M") sum /= (M.size*M.size-M.size) / 2
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
        .format(this).replace(',','.')