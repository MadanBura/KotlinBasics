package FunctionReference

fun main() {

    val result = mathOperation(4,5,::sum)
    println("Addition of two number is $result")

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

// Higher-order function that takes a function reference as a parameter
fun mathOperation(a:Int, b:Int,operation: (Int, Int) -> Int):Int{
    return operation(a,b)
}