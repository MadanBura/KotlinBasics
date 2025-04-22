package OOP_Concepts

fun main() {

    //Companion objects are class level members you can access directly using className
    println(Calculator.COMPANY)
    println("Sum of numbers are : "+Calculator.sum(10,10))

}
//Like static methods and properties in java,,,,, accessed by class name.property
//companion object is a special type of
// object declaration that allows you to define static methods
// and properties within a class

class Calculator(){

    companion object{

        const val COMPANY = "NEOSOFT"

        fun sum(a:Int, b :Int) : Int{
            return a + b
        }

    }


}