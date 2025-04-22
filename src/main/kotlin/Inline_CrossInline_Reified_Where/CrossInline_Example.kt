fun main() {

    println("Started main function ")

    MathOperations({
        println("In function one ")
        println("In function one ")
        println("In function one ")

        return@MathOperations
    },
        {
            println("In function two ")
            println("In function two ")
            println("In function two ")

            return

    })

    var a = 10
    var b = 15

    println("Sum is : ${a+b}")

}

 inline fun MathOperations(crossinline fun1: ()-> Unit, fun2:()-> Unit){
    fun1()
    fun2()
}


