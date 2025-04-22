package Collection

fun main() {

    val numString = listOf("One","two","Three","Four","Five")
    println(numString.joinToString())

    val listNumString = StringBuffer("The list of numbers are : ")
    println(numString.joinTo(listNumString))
    println(numString.joinToString(separator = "|", prefix = "Start : ", postfix = " : End"))

    val num = (1..100).toList()
    println(num.joinToString(limit = 15, truncated = "<..>"))
    println(numString.joinToString { "Element : ${it.uppercase()}" })

}