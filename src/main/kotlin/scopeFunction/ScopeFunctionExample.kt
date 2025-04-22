package scopeFunction


fun main() {


    val name: String? = "Hello"


    //it
//Returns the result of the last expression.
    val result = name.let {
        println("The length of this string is : ${name?.length}")
        it?.length
    }
    println("let : $result")


    //this
//Useful when initializing or configuring an object.
    val fresult = "Final"

    val f_result = fresult.run {
        this+"URI:1998:com"
    }

    val greeting = "Hello".run {
        println(this)
        this + "Kotlin"
    }
    println("run : $greeting")

//with --> this
 //   It is not an extension function; it takes the object as an argument.
   // Returns the result of the last expression.
    val person = with(Person("ABC", 30)) {
        println("Name is $name")
        println("age is $age")

    }



//Useful for configuring or initializing an object.
//Returns the object itself.
    val car = Car().apply {
        color = "RED"
        model = "CIAZ"
        speed = 12
    }
    println(car)


    //Used for performing some additional actions on an object.
    //Returns the object itself.
    val list = mutableListOf("One", "Two", "Three")
    list.also {
        println("The original list is: $it")
    }.add("Four")
// The list will be modified with "Four" added to it

}


data class Person(val name :String, val age : Int)

class Car {
    var color: String = ""
    var model: String = ""
    var speed: Int = 0
}