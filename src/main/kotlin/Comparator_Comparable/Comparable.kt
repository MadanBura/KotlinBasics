package Comparator_Comparable

fun main() {

    val numList_ = listOf(2,4,5,4,3,6,9,7,5)

    numList_.sorted().forEach { println(it) }

    //for user defined type we need to implement comparable

    var laptopslist = listOf(
        Laptops("Lenevo", 2016, 4, 54000),
        Laptops("HP", 2013, 4, 26000),
        Laptops("Dell", 2020, 8, 34000),
        Laptops("Apple", 2015, 4, 61000) )


    println("Sorting by Prices : Natural sorting")
    laptopslist.sorted().forEach { println(it) } //sorting by price
    println()
    println("Sorting by Year of Manufacturing : Custom Sorting ")
    laptopslist.sortedWith(ByYearOfLaptops()).forEach { println(it) }
}



//Comparable --> current object (this) with another object of the same type.
data class Laptops(val laptopName:String, val year :Int, val ram :Int, val price : Int) : Comparable<Laptops>{
    override fun compareTo(other: Laptops): Int {
        if(this.price > other.price){
         return 1
        }else if (this.price<other.price){
            return -1
        }else{
            return 0
        }
    }
}




class ByYearOfLaptops : Comparator<Laptops>{
    override fun compare(o1: Laptops, o2: Laptops): Int {
            if(o1.year>o2.year){
                return 1
            }else if (o1.year<o2.year){
                return -1
            }else{
                return 0
            }
    }
}
