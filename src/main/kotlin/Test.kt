import Arrays.arr

fun main() {

    val str : String = "Hello world"

    val result = StringBuilder()
//    for(i in str.length-1 downTo  0){
//        result.append(str[i])
//    }
//
//    println(result)

    //val arrWord : Array<String> = str.split(" ").toTypedArray()
    val arrWord : List<String> = str.split(" ")

    for(s : String in arrWord){
        for(i in s.length-1 downTo 0){
            result.append(s[i])
        }
        result.append(" ")
    }

    val arrChar : CharArray = str.toCharArray();
    for (i in arrChar.size-1 downTo 0){
        print(arrChar[i])
    }

    //println(finalStr)

    println()
    println(result)

}