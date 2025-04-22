package OOP_Concepts

fun main() {

    var emp1 = Employeee();

    emp1.name = "John"
    emp1.dept = "mobile"
    emp1.salary = 45000


    println(emp1)
}

class Employeee{


    ///Setters
    //use field keyword to set the value

    var name :String = ""
        set(value) {
            if(value.isNotBlank() && value[0].isUpperCase())
                field= value
            else
                println("Please re-enter your name")
        }

    var dept :String = ""
        set(value) {
            if(value.isNotBlank() && value[0].isLowerCase()){
               field= value
            }else {
                println("Please enter dept name")
            }
        }

    var salary:Int = 0
        set(value) {
            if(value <50000)
                field = value
            else
                println("Please enter correct salary")
        }

    override fun toString(): String {
        return "Employeee(name='$name', dept='$dept', salary=$salary)"
    }

}