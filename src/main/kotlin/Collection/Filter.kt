package Collection

fun main() {

    val numberString = listOf("One","two","Three","Four","Five")
    println(numberString.filter { it.length>3 })

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2,"Key 3" to 3,"Key 4" to 4,"Key 101" to 101)
    val filteredMap =numbersMap.filter { it.key.endsWith("1") && it.value >100 }
    println(filteredMap)

    val filterIndex = numberString.filterIndexed{index, value -> (index !=0) && (value.length <5)  }
    println(filterIndex)

    val mixedList = listOf(1,3,4,56,7,"Hello WOrld", 'A', 'B', 'C', 13.00, false)
    mixedList.filterIsInstance<Char>().forEach {
        println(it)
    }

    println()
    //Partition
    val (match,rest) =  numberString.partition { it.length>3 }
    println(match)
    println(rest)

}