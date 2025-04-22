package ArrayProblems


//print maximum count of 1's chain in array of numbers containing 0 and 1

fun main() {

    val arr = arrayOf(1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1)

    var currentCount = 0
    var maxCount = 0

    for (i in arr){
        if(i==1){
            currentCount++
            if(currentCount > maxCount){
                maxCount = currentCount
            }

        }else{
            currentCount = 0
        }
    }

    println("Max Consecutive count is : $maxCount")


}

