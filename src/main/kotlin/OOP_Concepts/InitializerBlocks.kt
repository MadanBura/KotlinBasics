package OOP_Concepts

fun main() {

    var userObject = User("Madan", "Mobile", 23)

    //for set(value) i.e; setter invokation
    //  userObject.age = 17;

    println(userObject)

}

//class parameters passed inside brackets
class User(name: String, var dept: String, age: Int) {

    var name: String

    //OR we can write like this
    var age: Int = 0

        //Setter is only executed when you invoke obj.age(25) like this
        set(value) {
            field = if (value > 18) {
                value
            } else {
                println("User age must be greater than 18")
                0
            }
        }

    //initializer block are used to validate the properties that are used inside class
    //or before initializing properties
    init {

        if (name.lowercase().startsWith('a')) {
            this.name = name
        } else {
            this.name = "User"
            println("User name must starts with 'a' or 'A' ")
        }
    }

    init {
        if (age > 18)
            this.age =age
        else
            this.age = 0
            println("Age should be greater than 18")
    }

    override fun toString(): String {
        return "User(dept='$dept', name='$name', age=$age)"
    }


}
