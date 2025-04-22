package Lambdas

import OOP_Concepts.Employee

//Normal FUnction
fun add(a:Int, b:Int): Int{
    return a+b
}

//Lambda Function
//val add_ : (Int,Int)->Int = {a:Int, b:Int->a+b}
val add_ : (a:Int,b:Int)-> Int = {a, b -> a+b}

//
val listEmp_ : MutableList<Emps_> = mutableListOf()

val iterateOverList : (MutableList<Emps_>) -> Unit = {e : MutableList<Emps_> -> println(e.toString()) }

fun main(){
    println(add_(10,9))

    listEmp_.add(Emps_("ABC", 22))
    listEmp_.add(Emps_("ghjk", 23))
    listEmp_.add(Emps_("AoiuyBC", 24))
    listEmp_.add(Emps_("qwer", 25))

    iterateOverList(listEmp_)
}



data class Emps_(val name:String, val age :Int)