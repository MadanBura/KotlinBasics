package ArrayProblems

import Arrays.arr

//I. merge two list by taking alternatively values from another
// eg( [2,3,5,8] [1,4,9,7, 8] output should be [2,1,3,4,5,9,8,7]

fun main() {

   val arr1 = intArrayOf(2,3,5,8)
   val arr2 = intArrayOf(1,4,9,7)


    mergingArray(arr1, arr2)
}

fun mergingArray(arr1 : IntArray, arr2 : IntArray){
    val size = arr1.size + arr2.size
    val finalArr = IntArray(size)

    var pointer = 0

    // Alternate between arr1 and arr2 values
    for (i in arr1.indices) {
        finalArr[pointer++] = arr1[i]
        finalArr[pointer++] = arr2[i] 
    }

    // Print the merged array
    println(finalArr.joinToString(","))
}