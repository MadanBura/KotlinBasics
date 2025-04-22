fun main() {


    //if condition
    val a = 5
    val b = 11

    val result = if (a > 10 || b < 1) {
        println("==========")
        "Result from one"
    }else {
        println("+++++++++++")
        "Result from two "
    }
    println("${result}")


    val ans = if (a > 10 || b < 1) "Result from one" else 10
    println("${ans}")


    //When
    var alarm = 12
    when (alarm){
//        10 -> println("The time is ${alarm}")
//        11 -> println("The time is ${alarm}")
//        12 -> println("The time is ${alarm}")

        10, 11, 12 -> println("The time is ${alarm}")


        //In range
        in 1..10 -> println("The time is ${alarm}")
        else -> println("The time is ${alarm}")


    }

    //OR
//    val grade = 90
//    var answer: String = when (grade) {
//        in 75..95 -> {
//            println("Grade is >> ")
//            "for ${grade} is A Class"
//        }
//
//        65, 70, 75 -> {
//            println("Grade is >> ")
//            "B Class"
//        }
//
//        else -> {
//            println("Grade is >> ")
//            "C Class"
//        }
//    }

    val grade = 90
    var answer: String = when (grade) {
        in 75..95 -> "for ${grade} is A Class"
        65, 70, 75 ->    "B Class"
        else -> "C Class"
    }
    println(answer)

//    val grade = 90
//    var answer: String = when {
//        grade <= 90 -> "for ${grade} is A Class"
//        grade ==75 || grade ==80 ->    "B Class"
//        else -> "C Class"
//    }
//    println(answer)

    //Nullify
    var myVal : String? = null;

    //Non null assertion
   // val nonNullString: String = myVal!!

  //  println(nonNullString)


    //Even number using while-loop
    var startNum = 1
    var lastNum = 20
    while(startNum <= lastNum){
        startNum++;
        if((startNum % 2 ) != 0){
            continue
        }
        println(startNum)
    }
}