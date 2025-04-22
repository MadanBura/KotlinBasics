package OOP_Concepts

fun main() {

    var empObject = Employee("Madan", "Mobile", "L3", "DELL", 50000)

//    empObject.empName = "Madan"
//    empObject.department="Mobile"
//    empObject.asset="DELL"
//    empObject.grade="L4"
//    empObject.salary=50000


    empObject.welDept()
    empObject.assetGiven()

    println(empObject.toString())
}

//Classes and Objects Are called properties
//() <- this is called constructor

// When to use parameters and when to use properties:
// - Parameters are used in constructors to initialize an object's state directly with values passed at the time of object creation.
// - Properties are used to represent the object's state and can include additional logic such as validation or transformation when accessed or modified.

// Constructor parameters are used to pass initial values to the class when creating an instance.
class Employee(var empName: String, var department: String, var grade: String, var asset: String, var salary: Int) {

    //Optional to declare here we can declare all variable inside constructor also
//    var empName = empName
//    var department = dept
//    var grade = grade
//    var asset = asset
//    var salary = salary


    // Properties are used to encapsulate the state of the class and control access to it.
    // Getters and setters allow for validation or modification of property values.


    //custom getters and setters for private properties to control how the
    // property values are accessed and modified.

//    // Getter and setter for empName
//    var empName: String
//        get() = _empName
//        set(value) {
//            _empName = value.capitalize()  // Ensure the name is capitalized
//        }
//
//    // Getter and setter for department
//    var department: String
//        get() = _department
//        set(value) {
//            _department = value.toUpperCase()  // Convert department to uppercase
//        }
//
//    // Getter and setter for grade
//    var grade: String
//        get() = _grade
//        set(value) {
//            _grade = value
//        }
//
//    // Getter and setter for asset
//    var asset: String
//        get() = _asset
//        set(value) {
//            _asset = value
//        }
//
//    // Getter and setter for salary
//    var salary: Int
//        get() = _salary
//        set(value) {
//            if (value >= 0) {
//                _salary = value
//            } else {
//                println("Salary cannot be negative. Setting salary to 0.")
//                _salary = 0
//            }
//        }


    fun welDept(){
        println("Welcome to ${department} department")
    }
    fun assetGiven(){
        println("${asset} is handovered...")
    }


    override fun toString(): String {
        return "Employee(empName='$empName', department='$department', grade='$grade', asset='$asset', salary=$salary)"
    }

}
