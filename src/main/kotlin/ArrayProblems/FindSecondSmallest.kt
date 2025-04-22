package ArrayProblems

fun main() {

    val arr = arrayOf(1, 5, 2, 3, 7, 6, 4, 5)

    var min = Int.MAX_VALUE
    var secMin = Int.MAX_VALUE

    for(i in arr){
        when{
            i < min ->{
                secMin = min
                min = i
            }
            i!= min && i<secMin ->{
                secMin = i
            }
        }
    }

    println(secMin)


}


