package ConditionalStatement

fun main() {

    //if, else if, and else
    val a = 10
    val b = 20

    // Simple if-else
    if (a > b) {
        println("a is greater than b")
    } else {
        println("a is not greater than b") // Output: a is not greater than b
    }

    // if-else if-else ladder
    val number = 0
    val result1 = if (number > 0) {
        "Positive"
    } else if (number < 0) {
        "Negative"
    } else {
        "Zero"
    }
    println(result1)


    //// When ---->

    val x = 2

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2") // Output: x is 2
        3 -> println("x is 3")
        else -> println("x is not 1, 2, or 3")
    }

    // when used as an expression
    val result = when (x) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Unknown"
    }
    println(result) // Output: Two

    // when without an argument
    val y = 15
    when {
        y % 2 == 0 -> println("Even number")
        y % 2 != 0 -> println("Odd number") // Output: Odd number
    }

    // Looping through a range
    for (i in 1..5) {
        println(i) // Output: 1 2 3 4 5
    }

    // Looping through an array
    val array = arrayOf("a", "b", "c")
    for (item in array) {
        println(item) // Output: a b c
    }

    // Looping with indices
    for (index in array.indices) {
        println("Element at index $index is ${array[index]}")
        // Output: Element at index 0 is a, and so on
    }

    // Looping with a step
    for (i in 1..10 step 2) {
        println(i) // Output: 1 3 5 7 9
    }

    //for-in-untill  (it exclude last number i.e;10)
    for (i in 1 until 10) {
        println("i = $i")
    }

    //for-in downTo (Starting from 10 to 1)
    for (i in 10 downTo 1) {
        print(" >> $i" + " ")
    }
    println()

    //for-in untill-step (Starting from 1 upto 10 but increase by 2)
    for (i in 1 until 10 step 2) {
        print(" >> $i" + " ")
    }
    println()

    ///while --->
    //Even number using while-loop
    var startNum = 1
    var lastNum = 20
    while(startNum <= lastNum) {
        startNum++;
        if ((startNum % 2) != 0) {
            continue
        }
        println(startNum)
    }

    ///do -while
    var i = 5

    do {
        println(i)
        i--
    } while (i > 0)



    //break, continue

    for (i in 1..10) {
        if (i == 5) break
        println(i) // It breaks the loop and exit the current one when given condition occure
    }

    for (i in 1..10) {
        if (i == 5) continue
        println(i) // it surpases the loop when given condition occure
    }


    //Repeat -->
    repeat(3) {
        println("Hello, World!") // Output: Hello, World! (3 times)
    }
}
