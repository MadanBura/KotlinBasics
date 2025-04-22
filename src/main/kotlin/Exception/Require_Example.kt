package Exception

fun main() {

    createUser("alice", 25)
    createUser("aadan", 10)  // Valid input, user created
    createUser("", 30)       // Throws IllegalArgumentException: Name cannot be blank
    createUser("Alice", -5)

}

fun createUser(name :String, age :Int){
    require(name.startsWith("a")){"Name should be start with A letter"}
    require(age>18){"age must be greater than 18"}


    println("User created: Name = $name, Age = $age")

}

