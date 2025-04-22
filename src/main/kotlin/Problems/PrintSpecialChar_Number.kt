package Problems

fun main() {

    val str = "madanbura56@gmail.com"

    val charArray = str.toCharArray()

    val s = StringBuilder()
    for ( c in charArray){
        if(c.isLetter()){
            s.append(c)
        }
    }
    println(s)

    val s1 = StringBuilder()
    for (c in charArray){
        val aV = c.toInt()
        if(( aV in (65..90)) || ( aV in (97..122))){
            s1.append(c)
        }
    }
    println(s1)


}