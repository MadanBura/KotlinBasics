package Arrays

import kotlin.math.max
var arr : Array<Int> = arrayOf(7,4,5,8,9,2,3,1,6)

fun main() {

    var maxNum = findMax(arr)
    var minNum = findMin(arr)

    println("Maximum number in Array is : ${maxNum}")
    println("Minimum number in Array is : ${minNum}")

}

fun findMax(array: Array<Int>) : Int{
    var maxNum = arr[0]

    for( num in arr){
        if(num > maxNum)
            maxNum = num
    }

    println("Type of Maximum number is  ${maxNum::class.java}")
    return maxNum
}

fun findMin(array: Array<Int>) : Int{
    var minNum = arr[0]

    for( num in arr){
        if(num < minNum)
            minNum = num
    }

    println("Type of Minimum number is  ${minNum::class.java}")
    return minNum
}
