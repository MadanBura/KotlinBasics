package OOP_Concepts

//we can define multiple constructor that are called as secondary ctor

fun main() {

    var stdObj = Student("Madan", "B", 25)
    var stdObj1 = Student("Madan")
    var stdObj2 = Student("Madan", "Bura")


    println(stdObj)
    println(stdObj1)
    println(stdObj2)
}

class Student(var stdName: String, var lastName : String, var age : Int){

    //Secondary Ctor is declared using "Constructor" keyword
    constructor(stdName: String) : this(stdName, "defaultName", 0)
    constructor(stdName: String, lastName: String) : this(stdName, lastName, 0)

    override fun toString(): String {
        return "Student(stdName='$stdName', lastName='$lastName', age=$age)"
    }


}
