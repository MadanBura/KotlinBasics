package OOP_Concepts


//it is used when creation of object is very complex and expensive
fun main(){

    var user1 = UserClass("Madan", "B", 26)


    //Lazy initialization is used when only created object using lazy{}
    //are used somewhere after in ur programme
    val user2 by lazy {
        UserClass("TONY", "S", 49)
    }

    println(user1)

    println(user2)

}

class UserClass(var firstName : String, var lastName : String, var age: Int){
    init {
        println("User : $firstName was created ")
    }

    override fun toString(): String {
        return "UserClass(firstName='$firstName', lastName='$lastName', age=$age)"
    }


}