package OOP_Concepts

//Use a data class ------> when you need a simple class to hold and manage data
// with built-in functionality for comparison, copying, and destructuring.

//Use a regular class ------>  when you need more control over the class’s behavior,
// inheritance, or custom logic that doesn't fit the typical data-holding role.


fun main() {

    var boy1 = Boys("Madan", "B", 26)
    //var boy2 = Boys("Madan", "B", 26)
    var boy2 = boy1

    println(boy1 == boy2)
    println(boy1 === boy2)

    println(boy1)
}

data class Boys(val name:String, val lastName:String, val age :Int){

}