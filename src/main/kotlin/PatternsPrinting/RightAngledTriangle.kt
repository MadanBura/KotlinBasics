package PatternsPrinting

fun main() {

    var row = 5
    for (i in 1 ..  row){
        for (j in row-1 downTo i){
            print(" ")
        }
        for(k in 1..i){
            print("*")
        }
        println()
    }
}