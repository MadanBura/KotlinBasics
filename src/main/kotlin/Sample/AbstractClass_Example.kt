//package Sample
//
//fun main() {
//
//    var arr = arrayOf(Circle_Ab("Circle", 4),Square_Ab("Square", 4),
//        Rectangle_Ab("Rectangle", 5,6))
//
//    callMethods(arr)
//
//}
//
//fun callMethods(objects: Array<Shapes_>){
//    for(obj in objects){
//        obj.draw()
//       println("Area is : ${obj.calArea()}")
//    }
//}
//
////Partial Implementation
////base class - to provide common behavoiur for its derived class
////enforeces contract that its derived class should implement all base class methods
//
//abstract class Shapes_() {
//    abstract fun draw();
//    abstract fun calArea() : Double;
//}
//
//class Circle_Ab(var name_ : String, var arg : Int) : Shapes_(){
//    override fun draw() {
//        println("$name_ is created")
//    }
//    override fun calArea() : Double{
//        return Math.PI * arg * arg
//    }
//}
//
//class Square_Ab(var name_: String, var arg: Int) : Shapes_(){
//    override fun draw() {
//        println("$name_ is created")
//    }
//    override fun calArea(): Double {
//        return (arg*arg).toDouble()
//    }
//}
//
//class Rectangle_Ab(var name_: String, var len : Int, var wid : Int) : Shapes_(){
//    override fun draw() {
//        println("$name_ is created ")
//    }
//    override fun calArea(): Double {
//        return (len * wid).toDouble()
//    }
//}
//
