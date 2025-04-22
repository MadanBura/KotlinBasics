package Collection

fun main(){

    val numbers = setOf(1,2,3,4,5,6,7,8,9)

    println(numbers.map { it*10 })
    println(numbers.map { if (it==3) it*100 else it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if(index == 0) null else index * value })

    println()
    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2,"Key 3" to 3,"Key 4" to 4,"Key 5" to 5)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { if (it.value%2==0) it.value*10 else it.value*2 })

    //Zipping
    val colour = listOf("red","brown","grey")
    val animal = listOf("fox", "bear", "wolf")

//    println(colour.zip(animal))
    println(colour zip animal)
    println()

    println(colour.zip(animal){colour,animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $colour"})

    val numberPairs = listOf("One" to 1,"Two" to 2,"Three" to 3,"Four" to 4,"Five" to 5)

    println(numberPairs)
    println(numberPairs.unzip())
    println()

    val numberList = listOf("One","Two","Three","Four","Five")
    println(numberList.associateWith { it.length })
    println(numberList.associateBy { it.first().uppercase()})

    println(numberList.associateBy(keySelector = {it.first().uppercase()},
        valueTransform = {it.length}))

    //Flatten --> multidiamensional Array
      val numbersMultiArray = listOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println(numbersMultiArray[2][2])

    val numbersSet = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    for (num in numbersSet){
        for (n in num){
        print("$n "  )
        }
        println()
    }

    //convert multidiamensional array to single diamensional array
    val numberFlatten = numbersSet.flatten()
    println(numberFlatten)

}
