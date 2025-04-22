package ArrayProblems

fun main() {

    var arr : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10, 11)

    println(arr.distinct())

    //Creating set here
    val seen = mutableSetOf<Int>()
    val result = arr.filter {seen.add(it) }
    println(result)


    for (i in arr.indices){
        for(j in i+1 until arr.size){
            if(arr[i] == arr[j]){
                arr[j] = 0
            }
        }
        if(arr[i]!=0){
            println(arr[i])
        }
    }


}