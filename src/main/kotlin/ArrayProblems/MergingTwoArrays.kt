package ArrayProblems

//merge two given arrays and return the resultant array.
//	input-arr1 = [1,2,3,4] arr2 = [7,8,9]
//	output- [1,2,3,4,7,8,9]

fun main() {

    var arr1 = arrayOf(1,2,3,4,5)
    var arr2 = arrayOf(6,7,8)

    var ansArr = arr1+arr2
    println(ansArr.joinToString(","))

}