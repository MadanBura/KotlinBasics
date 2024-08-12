package Function

fun main() {
    hello()
    var a = 15
    var b =20

    add(a,b)

    var ans = returningSomething(a,b)
    println("Result is ${ans}")

    returnVoid(a,b)
    val ok = returnVal(a,b)
    println("${ok}")

    defaultArgument("alexa")

    namedParameter(age = 22, name = "Madan")

    println("result is >> "+ sum(1,2,3,4,5,6,6,7,8,8,9))
    println("result is >> "+ sumByForEach(1,2,3,4,5,6,6,7,8,8,9))


}

fun hello(){
    println("Hello world");
}

fun add(a:Int, b:Int){
    println("addition of two number is ${a+b}")
}

//function which is returning anything
fun returningSomething(a : Int, b:Int) : Int{
    return a+b;
}

//Function which returning nothing
fun returnVoid(a:Int, b:Int) : Unit{
    println("Thank you ${a*b}")
}

fun returnVal(a:Int, b:Int) = if (a>=b) a else b

//Default Arguments
fun defaultArgument(name : String, message : String = "Hello"){
    println("$name and $message")
}

//Named Paramater - define in way that they are called in function parameter(Dependends on sequence)
fun namedParameter(name:String? =null,  age: Int? ){
    println("$name and age is $age")
}

//vararg ->(Variable Arguments) keyword is allow us to pass more than one parameter in function parameter
// sum(1,2,3,4,4,5,5,6)
fun sum(vararg num: Int): Int{
    var result = 0;
    for (a in num){
        result += a;
    }
    return  result
}

fun sumByForEach(vararg n : Int): Int{
    var res = 0;
    n.forEach { res+=it }
    return res;
}