package Variables

fun main() {

    //      Type Inference :
    //     While you declaring and assigning with var and val and doesn't provided its type
    //     Ex =  var name  = "NeoSoft" or var age = 18;
    // it will implicitly takes its type, and checks at compile time when you reassingning
    // with new value


    //1. var is mulable variable that means you can reassign them
    var name = "Hello"
    //value of name can be changed in further programming

    name = "World"


    //2. Val --> It is Immutable, Once assigned you can't be re-assigned different value after intialization
    val schoolName = "Modern_HighSchool"
    //schoolName = "AAAAAAAAAAA" -> //Val cannot be reassigned


    //Var and Val with Object
    val person1 = Person("Madan", 26)
   // person1.personName=""// This will cause an error because firstName is immutable
    println(person1.personName)


    var person2 = Person("ABC", 27)
    println(person2.personName)
  //  person1 = person2// This will cause an error because person1 is declared with val


    var person3 = Person("AAAAAAAAA", 22)
    println(person3.personName)

    person3 = person2
    println(person3.personName)




}



class Person(val personName : String, var personAge : Int)