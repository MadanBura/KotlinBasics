package SimpleProblems


fun main1() {

    var str  = "Madam"
    var st1 = "Madan"

    if (    str.lowercase() == st1.lowercase().reversed()
    ){
        println("Ok")
    }else{
        println("NOt ok")
    }
}

fun main() {

    var n = 123
    var ans = 321

    var newAns = 0

    while (n>0){
        var rem = n%10
        newAns = newAns*10 + rem
        n = n/10
    }

    println("New number : $newAns")


}