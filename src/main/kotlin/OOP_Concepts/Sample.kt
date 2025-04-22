package OOP_Concepts

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun fly()
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Duck is flying")
    }


}

fun main() {
    val duck = Duck()
    duck.fly()  // Outputs: Duck is flying

}
