package Problems

fun main() {

    val str = "A"

    if (checkPalindrom(str.lowercase())){
        println("Given string is palindrom")
    }
    else{
        println("Sorry given string is not palindrom")
    }
}


fun checkPalindrom(strC: String): Boolean {

    var left = 0
    var right = strC.length - 1

    while (left < right) {
        if (strC[left] != strC[right]) {
            return false
        }
        left++
        right--
    }
    return true

}