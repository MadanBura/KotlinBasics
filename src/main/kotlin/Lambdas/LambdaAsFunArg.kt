package Lambdas

fun main() {

    val lstN = mutableListOf(1,2,3,4,5)

    lambdaAsFunArg(lstN) { println(it) }
}

fun lambdaAsFunArg(num : MutableList<Int>, op : (Int) -> Unit) : Unit{
    println(num.map { it })
}