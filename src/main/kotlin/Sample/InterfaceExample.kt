package Sample


fun main() {

    var arr1 : Array<Drawable> = arrayOf(Circle_IN("Circle", 4),Square_IN("Square", 4),
        Rectangle_IN("Rectangle", 5,6), Tester())

    callMethods_(arr1)

}

//Here we cant able to access tester draw method so for that we need to create interface
interface Drawable{
    fun draw()
}

fun callMethods_(objects: Array<Drawable>){
    for(obj in objects){
        obj.draw()
      //  println("Area is : ${obj.calArea()}")
    }
}

//Partial Implementation
//base class - to provide common behavoiur for its derived class
//enforeces contract that its derived class should implement all base class methods

abstract class Shapes_ : Drawable{
    abstract override fun draw();
    abstract fun calArea() : Double;
}

class Circle_IN(var name_ : String, var arg : Int) : Shapes_(){
    override fun draw() {
        println("$name_ is created")
    }
    override fun calArea() : Double{
        return Math.PI * arg * arg
    }
}

class Square_IN(var name_: String, var arg: Int) : Shapes_(){
    override fun draw() {
        println("$name_ is created")
    }
    override fun calArea(): Double {
        return (arg*arg).toDouble()
    }
}

class Rectangle_IN(var name_: String, var len : Int, var wid : Int) : Shapes_(){
    override fun draw() {
        println("$name_ is created ")
    }
    override fun calArea(): Double {
        return (len * wid).toDouble()
    }
}

class Tester : Drawable{

    override fun draw(){
        println("Tester is Drawing ")
    }

}

