package OOP_Concepts

fun main() {

    Singleton.testSingleton()

    println(Singleton)

}


//Implementing a Singleton pattern in Kotlin using object ensures that
// there is only one instance of the object created throughout the application's lifecycle.
object Singleton{

    init {
        println("Singleton is printed ")
    }

    fun testSingleton(){
        println("Testing singletonFunction")
    }

}