package FunctionReference

fun main() {

    val reference_ = ::greet
    println(reference_("Madan"))
}

fun greet(name :String) : String{
    return "Hello $name"
}