package SimpleProblems

fun main(){

    val arr = arrayOf(2,4,5,7,8,5,3,2)

    var max = arr[0]
    var secondMax = arr[0]


    for(i in arr){
        if(max<i){
            secondMax = max
            max = i
            if(i>secondMax && i<max){
                secondMax = i
            }
        }
    }

    println("$max and $secondMax" )

}