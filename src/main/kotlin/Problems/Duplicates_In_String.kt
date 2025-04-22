package Problems

fun main() {

    val str = "Hello World"

    var capCount = 0
    var smallCount = 0

    val charArray = str.toCharArray()

    charArray.distinct().forEach { print(it) }
    println()

    for (c in charArray){
        val aV = c.toInt()
        if( aV in 65..90){
            capCount++
        }else if (aV in 97..122){
            smallCount++
        }
    }

    println("Captial letters $capCount and small letters $smallCount")

//
//    for (c in charArray){
//        if(c.isUpperCase()){
//            capCount++
//        }else if( c.isLowerCase()){
//            smallCount++
//        }
//    }


    for (c in 0 ..charArray.size){
        var count = 1
        for (a in c+1..<charArray.size){
            if(charArray[c] == charArray[a]){
                count++
                charArray[a] = '*'
            }
        }
        if(count>1 && charArray[c] != '*'){
            println("${charArray[c]} count is $count")
        }
    }

    println("========")
    charArray.filter { it!='*' }.forEach { print(it) }
}