package ArrayProblems

fun main() {

    val arr = arrayOf(0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1)

    var count = 0
    var maxCount = 0

    for (i in arr.indices){
        if(arr[i]==1){
            count++
        }else{
            if(count>maxCount){
                maxCount = count
            }
            count = 0
        }
    }

    if(count>maxCount){
        maxCount = count
    }
    println(maxCount)
}
