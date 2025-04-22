package SimpleProblems

fun main() {
    var a = 0
    var b = 1
    var c = 0

    // Print the first two numbers of the Fibonacci sequence
    print("$a, $b")

    // Loop to calculate and print the next numbers in the Fibonacci sequence
    for (i in 2..10) {
        c = a + b
        print(", $c")
        a = b
        b = c
    }

    println()  // Print a newline at the end
}
