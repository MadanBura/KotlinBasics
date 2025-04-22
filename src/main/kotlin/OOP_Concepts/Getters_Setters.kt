package OOP_Concepts

fun main() {

}

class Developer{
//For getters and setters
    //Are implicitly developed by kotlin while you call the properties
    //while setting the value use FIELD to set or initialize

    var name : String=""

        get() { return field }

        set(value) {
            if(value.isNotBlank())
                field = value
            else
                println("Please enter name")
        }

    var department : String=""

        get() {
            return field
        }
        set(value) {
            if (value.isNotBlank())
                field = value
            else
                println("Please enter department >> ")
        }

}