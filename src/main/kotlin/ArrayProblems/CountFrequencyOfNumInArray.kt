package ArrayProblems

fun main() {

    var arr : Array<Int> = arrayOf(1,2,3,4,3,2,3,4,5,6,5,4,3,2,4,5,6,7,8,5,5,6,7)

    var countFrequency = arr.groupBy { it }.mapValues { it.value.size }

        countFrequency.forEach { (element, count) ->
        println("$element: $count")
    }

//    //Another way of doing this
//    for(i in arr.indices){
//        var count = 1
//        for (j in i+1 until arr.size){
//            if(arr[i]==arr[j]){
//                count++
//                arr[j] = 0
//            }
//        }
//        if(count!=0 && arr[i]!=0){
//            println("${arr[i]} : $count")
//        }
//    }


    //Another way
    var countUsingMap = mutableMapOf<Int, Int>()

    for(i in arr){
        countUsingMap[i] = countUsingMap.getOrDefault(i, 0)+1
    }


    countUsingMap.forEach{(element, countUsingMap)-> println("$element count is : $countUsingMap") }





}