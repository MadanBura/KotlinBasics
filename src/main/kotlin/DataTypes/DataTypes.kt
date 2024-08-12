package DataTypes

fun main() {

    //  Byte Short Int Long
    var maxIntegerValue : Int = Int.MAX_VALUE;
    var minIntegerValue : Int = Int.MIN_VALUE;

    println("Maximum Integer value : ${maxIntegerValue}")
    println("Minimum Integer value : ${minIntegerValue}")

    var maxByteValue : Byte = Byte.MAX_VALUE;
    var minByteValue : Byte = Byte.MIN_VALUE;

    println()
    println("Maximum Byte Value : ${maxByteValue}")
    println("Minimum Byte Value : ${minByteValue}")


    var maxLongVal : Long = Long.MAX_VALUE;
    var minLongVal : Long = Long.MIN_VALUE;

    println()
    println("Maximum Long Value : ${maxLongVal}")
    println("Minimum Long Value : ${minLongVal}")


    var shortMaxVal : Short = Short.MAX_VALUE;
    var shortMinVal : Short = Short.MIN_VALUE;

    println()
    println("Maximum Short Value : ${shortMaxVal}")
    println("Minimum Short Value : ${shortMinVal}")

    //FloatDouble
    var floatNum = 2.5f;
    var doubleNum = 2.5   //it will take double implicitly

    //Char and Boolean
    // if you don't provide its data type it will take implicity looking by its right side
    var charValue : Char = 'M'
    var booleanVal : Boolean = false

    //placeholder ${---} you can put only expression

}