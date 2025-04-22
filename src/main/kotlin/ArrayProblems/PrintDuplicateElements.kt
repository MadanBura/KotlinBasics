package ArrayProblems

fun main() {

    var arr : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,11)

    val duplicates = arr.groupBy { it }  // Group elements by their value --> it returns map --> key value pair
                                        // key --> 1 value --> Occurance [1,1]  (Map<Int, List<Int>>)
        .filter { it.value.size > 1 }    // Keep only elements that appear more than once
        .keys                            // Extract the keys (the duplicate numbers)

    println(duplicates)


    for ( i in arr.indices){
        for(j in i+1 until arr.size){
            if(arr[i]==arr[j]){
                print(arr[i])
            }
        }
    }



}

