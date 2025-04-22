package PatternsPrinting

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

fun main() {

    var row = 5
    var count = 0

    for (i in 1..row){
        for (j in 1..i){
            count++
            print("$count ")
        }
        println()
    }

}