import java.util.*


fun main(){

    var str = "you have to visit parel office tomorrow"

    str.capitilizeFirstLetterEach()

}

private fun String.capitilizeFirstLetterEach():String{

    var wordArr = this.split(" ")

    val capitalizedWords = wordArr.joinToString(" ") { word ->
            word.replaceFirstChar { it.uppercase() }
    }
    return capitalizedWords
}
private fun MutableList<Int>.swap(i: Int, j:Int){
}
