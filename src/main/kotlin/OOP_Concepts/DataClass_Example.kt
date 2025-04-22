package OOP_Concepts

// `==` Operator (Structural Equality) --> it internally all equalsTo method from string class
// double equals operator to check the value and returns boolean result

//`===` Operator (Referential Equality)
//  to check whether two references point to the same object in memory.
//  It compares the memory addresses of the objects, not their contents.

fun main() {

    var name1 = "Madan"
    var name2 = "Madan"

    println(name1 == name2) //true
    println(name1.equals(name2)) //true
    println(name1 === name2) //true

    var person1 = Person("Madan", "B", 26)
    var person2 = Person("Madan", "B", 26)

    println(person1 == person2) //true
    println(person1 === person2) //false

    println(person1.toString())


}


//user defined class or any class is defined from any class
class Person(var name :String, var lastName : String, var age : Int){

    //    override fun equals(other: Any?): Boolean {
//
//        if(this === other) {
//            return true
//        }
//
//        if(other is Person) {
//            return this.name == other.name &&
//                    this.lastName == other.lastName &&
//                    this.age == other.age
//        }
//
//
//        return false
//
//    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (lastName != other.lastName) return false
        if (age != other.age) return false

        return true
    }



    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }
}