package Function

fun main() {

    println(mathOperation(10,6, sum_))

}


val sum_ = {a:Int, b:Int -> a+b}
val sub_ = {a:Int, b:Int -> a+b}
val mul_ = {a:Int, b:Int -> a+b}
val div_ = {a:Int, b:Int -> a+b}


fun mathOperation(a:Int, b:Int, op:(Int, Int)->Int): Int{
    return op(a,b)
}
