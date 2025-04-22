package ArrayProblems

fun main() {

    val arr: Array<Int> = arrayOf(5, 6, 7, 8, 5, 3, 3, 4, 5, 6, 4, 3, 13, 1, 2, 11)


    val sum = arr.filter { it%2==0 }.sum()
    println(sum)


    //another approach
    var ans = 0
    for(i in arr){
        if(i%2 == 0){
            ans+=i
        }
    }
    println(ans)

}

