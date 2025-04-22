package PatternsPrinting

fun main() {

    var rows = 5

   for (i in 1..rows){
       for (j in i..<rows){
           print(" ")
       }
       for (k in 1..(2*i-1)){
           print("*")
       }
       println()
   }

}

/*
    *
   ***
  *****
 *******
*********
 */