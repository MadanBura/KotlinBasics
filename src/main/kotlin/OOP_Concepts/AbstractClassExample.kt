package OOP_Concepts

fun main() {

    var first =Volvo("X40", "White", 6,"XUV")

    println(first)

}

// Abstract Class ---->

abstract class FourWheeler(){

    abstract fun move()
    abstract fun stop()
}
//n Kotlin, an abstract class is a class that cannot be instantiated directly and is intended to be subclassed.
// It can contain abstract methods (methods without an body) that must be implemented by subclasses,
// as well as concrete methods (methods with an body) that can be inherited as-is.

//why abstract ---->
// Abstract classes are useful for defining common functionality or properties
// that should be shared among a group of related classes.

//By declaring methods as abstract, you enforce that any subclass
// provides a specific implementation, ensuring a consistent interface.
class Volvo(var name:String, var color : String,var seat : Int,var type : String) : FourWheeler(){
    override fun move() {
      println("$name is started ")
    }


    override fun stop() {
        println("$name is started ")
   }

    override fun toString(): String {
        return "Volvo(name='$name', color='$color', seat=$seat, type='$type')"
    }


}