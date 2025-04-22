package PatternsPrinting

/*
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

 */

fun main() {

    var row = 5
    for (i in 1..row){
        for (j in 1 until i){
            print(" ")
        }
        for ( k in i..row){
            print("* ")
        }
        println()
    }
    for (i in 1 until row){
        for (j in 1 until row-i){
            print(" ")
        }
        for (k in 1..i+1){
            print("* ")
        }
        println()
    }

}