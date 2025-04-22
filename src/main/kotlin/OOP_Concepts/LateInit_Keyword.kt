package OOP_Concepts

fun main(){

    val obj = LateInitExample()

    obj.favouriteMovie = "Avatar"

    println(obj)

}

//When you want declare property and not want assign value to them
// then use late init keyword

class LateInitExample{

    //Only this give error bcoz while declaring string you need to initialize it
   // var favouriteMovie : String
    //lateInit does not work with primitive types - i.e; int float char double float byte
    lateinit var favouriteMovie :String

    override fun toString(): String {
        return "LateInitExample(favouriteMovie='$favouriteMovie')"
    }


}