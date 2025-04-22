package PatternsPrinting

/*
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *

 */

fun main() {

    var row = 5

    for (i in 1..row){
        for (j in 1..i){
            print("*")
        }
       for (k in 1.. 2*(row-i)){
           print(" ")
       }
        for (l in 1..i){
            print("*")
        }
        println()
    }
    for (i in row-1 downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        for (j in 1..2 * (row - i)) {
            print(" ")
        }
        for (j in 1..i) {
            print("*")
        }
        println()
    }


}