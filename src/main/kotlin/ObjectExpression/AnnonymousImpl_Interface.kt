package ObjectExpression

interface Greet{
    fun greet(message : String)
}

var sample = object : Greet{
    override fun greet(message: String) {
        println("Good morning : $message")
    }

}

fun main(){

    sample.greet("Madan")

}
