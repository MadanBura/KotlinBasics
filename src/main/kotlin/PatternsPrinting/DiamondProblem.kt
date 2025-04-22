package PatternsPrinting

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

fun main() {

    var row = 5

    for (i in 1..row){
        for (j in i..row){
            print(" ")
        }
        for (k in 1..(2*i-1)){
            print("*")
        }
        println()
    }
    for (i in row-1 downTo 1){
        for (k in i..row){
            print(" ")
        }
        for (j in (2*i-1) downTo 1){
         print("*")
        }
        println()
    }



}