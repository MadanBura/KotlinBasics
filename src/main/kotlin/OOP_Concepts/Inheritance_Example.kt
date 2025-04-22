package OOP_Concepts


fun main() {

    var tataObject = Tata("Harrier", "Tata", "Black", 5)

    tataObject.move()
    tataObject.stop()


    println("\n")
    var mahindraObj = Mahindra("XUV700", "Mahindra", "Dark_Blue", 5)
    mahindraObj.move()
    mahindraObj.stop()


}

//for class level Open is used to allow inheritance -- class is open to inherite
//for method level is used to override the methods
//super is used to access super class members

open class Vehicle(val name : String, val company :String ){

    open fun move(){
        println("$name is moving")
    }
    fun stop(){
        println("$name is stopped")
    }

}

class Tata(name : String, company: String, val color : String, val seat : Int) : Vehicle(name, company){

    override fun move() {
        tataSuper()
        super.move()
    }

    fun tataSuper(){
        println("$name with new feature is going to launch ")
    }

}

class Mahindra(name : String, company: String, val color : String, val seat : Int) : Vehicle(name, company){



}