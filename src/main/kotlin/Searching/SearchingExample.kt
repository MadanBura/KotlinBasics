package Searching


fun main() {

    var numList = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40)


    val pos = SearchingElement(32, numList)
    if(pos !=0){
        println("The number is found at $pos")
    }else{
        println("Number is not found ")
    }

    val pos1 = SearchByBinarySearch(32, numList)
    if(pos1 !=0){
        println("The number is found at $pos1 th pass ")
    }else{
        println("Number is not found ")
    }
}


//Linear Search
private fun SearchingElement(searchingEle : Int, listNum: MutableList<Int>): Int{
    var i = 0
    for(n in listNum){
        i++
        println("Searched Count is : $i")
        if(searchingEle == n)
            return i
    }
    return 0


}

//Binary Search
private fun SearchByBinarySearch(searchingEle: Int, listNum: MutableList<Int>) : Int{
    var index= 0
    var start = 0;
    var end = listNum.size -1

    while (start<=end) {
        index++
        var mid = (start + end) / 2

        if (searchingEle == listNum[mid]) {
            return index
        }

        if (searchingEle < listNum[mid]) {
            end = mid - 1
        } else if (searchingEle > listNum[mid]) {
            start = mid + 1
        }

    }
        return 0
}
