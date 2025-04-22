package Function

import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

fun main() {

    println(sum(10,10))
}

//Normal Function
fun sum(a:Int, b:Int):Int{
    return a+b
}

//Lambdas
//syntax = variable  : DataType = {Defination/Body}
//val sum : (Int, Int) -> Int = {a,b -> a+b}
val sum = {a: Int, b:Int -> a+b}

//
// Define the lambda function
val multi = { a: Int, b: Int ->  a * b }

