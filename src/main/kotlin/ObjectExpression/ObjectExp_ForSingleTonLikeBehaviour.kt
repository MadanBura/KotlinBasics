package ObjectExpression



fun main() {

    val abc = object {
        fun log(message: String) {
            println("Log: $message")
        }
    }    

    abc.log("Hello, world!") // Output: Log: Hello, world!
}
