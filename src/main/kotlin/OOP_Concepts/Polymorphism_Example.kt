package OOP_Concepts


open class A{

    open fun printMessage(){
        println("Hi I am printing from Class A ")
    }

    fun printMessageOne(){
        println("Hi I am printing class A 1")

    }

}

class B : A(){

    override fun printMessage(){
        super.printMessage()
        println("Hi I am printing from B")
    }

    fun randomMethod(){
        println("ASFDGSFHJ")
    }

}

fun main(){

    val a : A = A()
    a.printMessage()
    a.printMessageOne()

    //val c : B = A() // Type mismatch

    val b : A = B()
    b.printMessage()
    b.printMessageOne()

    val o : B = B()
    o.randomMethod()





}
