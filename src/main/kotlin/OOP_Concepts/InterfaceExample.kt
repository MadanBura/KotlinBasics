package OOP_Concepts


fun main() {

    var calCircle = Circle(2)
    var calRectangle = Rectangle(2,3)

    println()

}

 interface Shape{
 
     fun calArea()
 }

class Circle(var radius : Int) : Shape{
    override fun calArea() {
        println("${Math.PI*radius*radius}")
    }
}

class Rectangle(var length : Int, var width : Int):Shape{
    override fun calArea() {
        println("${length*width}")
    }
}
