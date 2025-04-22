package ArrayProblems

//Array contains only 0 and 1, Write a program that sort this numbers using single loop

fun main(){

    val arr = arrayOf(0, 1, 0, 1, 1, 0, 0, 1)

    var index = 0

    for (i in arr.indices) {
        if (arr[i] == 1) {
            val temp = arr[i]
            arr[i] = arr[index]
            arr[index] = temp
            index++
        }
    }
    println(arr.joinToString(", "))
}



