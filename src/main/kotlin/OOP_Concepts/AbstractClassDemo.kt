package OOP_Concepts

fun main() {

    var lab = Labrador("Tuffy")

    lab.eat()
    lab.makesound()
}

abstract class Animal(val name:String){

    abstract fun makesound()

    fun eat(){
        println("$name is Eating")
    }
}

abstract class Dog(name:String) : Animal(name){

}

class Labrador(name :String) : Dog(name){
    override fun makesound() {
        println("booo")
    }

}