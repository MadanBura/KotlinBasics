package PatternsPrinting


/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */

fun main() {

    var row = 5

    for (i in 1..row){
        for (j in i..row){
            print(" ")
        }
        for (k in 1..i){
            print("$k ")
        }
        println()
    }

}