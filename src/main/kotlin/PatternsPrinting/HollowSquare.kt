package PatternsPrinting

/*
*****
*   *
*   *
*   *
*****

 */

fun main() {

    var row = 5
    for (i in 1..row){
        for (j in 1..row){
            if(j==1 || j==5 || i==5 || i==1){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }


}