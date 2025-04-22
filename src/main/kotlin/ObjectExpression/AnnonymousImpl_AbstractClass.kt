package ObjectExpression

abstract class Colour{
    abstract fun choose(clr : String)
}

var token = object : Colour(){
    override fun choose(clr: String) {
        println("Favourite Color is : $clr")
    }
}

fun main() {
    token.choose("Orange")
}