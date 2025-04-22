package SimpleProblems

fun main() {

    val number = 5 // You can change this to any non-negative integer
    val factorial = factorial(number)
    println("Factorial of $number is $factorial")


}

fun factorial(n :Int):Int{

    if(n==0 || n==1){
        return 1
    }

    return n * factorial(n-1)
}