package ArrayProblems


fun main() {

    val arr : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)

    println(arr.max())
    println(arr.min())

    var max = arr[0]
    for(i in arr.indices){
        if(max<arr[i]){
            max = arr[i]
        }
    }
    println("Maximum element is : $max")

    var min = arr[0]
    for(i in arr.indices){
        if(min>arr[i]){
            min = arr[i]
        }
    }
    println("Minimum element is : $min")



}
