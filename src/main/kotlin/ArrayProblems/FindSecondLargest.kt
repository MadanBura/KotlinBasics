package  ArrayProblems

import kotlin.math.max

//val arr: Array<Int> = arrayOf(5, 6, 7, 8, 5, 3, 3, 4, 5, 6, 4, 3, 13, 1, 2, 11)

fun main() {

    val arr: Array<Int> = arrayOf(5, 6, 7, 8, 5, 3, 3, 4, 5, 6, 4, 3, 13, 1, 2, 11)

    var maxVal = Int.MIN_VALUE
    var secVal = Int.MIN_VALUE

    for(i in arr){
        when {
            i > maxVal ->{
                secVal = maxVal
                maxVal = i
            }
            i > secVal && i<maxVal -> {
                secVal = i
            }
        }
    }

    println("Maximum is : $maxVal and Second Max is $secVal")

}