package Arrays

fun main() {

    var nameArray : Array<String> = arrayOf("Tony", "Captain", "Hulk", "Spider", "Mark")

    var numArray = arrayOf(1,2,3,4,5) // implicitly /infered integer type of array Array<Int>

    // Array<{Comparable<*> & java. io. Serializable}>
    var mixedArray = arrayOf(1,2,3,4,5,"Names", "ABC" );


//    for(name in nameArray){
//        println("name is : ${name}")
//    }

    println("name is : ${nameArray[0]}")
    println("name is : ${nameArray[1]}")

    //Size of Array
    println("Size of Array : ${nameArray.size}")


    //IF -is to check type of varibale stored with provided type and return boolean result
    for( para in mixedArray) {
        if (para is Int){
            println(para)
        }
    }


}