package Problems

fun main(){

    val str = "My name is Madan"

    //1.
    //println(str.reversed())


    //2.
    val charArray = str.toCharArray()
    for (char in charArray.size-1 downTo 0){
        print(charArray[char])
    }
}