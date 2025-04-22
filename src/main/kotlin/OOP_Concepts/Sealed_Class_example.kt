package OOP_Concepts


//Sealed class ---> The sealed keyword makes the Result class sealed.
// This means that all subclasses of Result must be defined in the same file.

//data class -----> is a class specifically designed to hold data.
// It automatically provides useful methods like toString(), equals(), hashCode(), and copy().

//Object ---> This is an object declaration.
//In Kotlin, object is a singleton, meaning that there is only one instance of Loading for the entire application.


//when Expression: The when expression checks the type of result. Since Result is a sealed class,
// the compiler knows all possible subclasses, so it will give a warning if you don’t handle every possible case.
//
//Handling Different Cases: Depending on whether result is a Success, Error
// the function prints an appropriate message.
// Each subclass of Result can be handled differently based on its type and properties.

fun main() {

    var success = Result.Success("SUCCESS !!! ")
    var error = Result.Error("Error !!! ")
    var loading = Result.Loading("Result is Loading !!")

    var failedDA = Result.Fail.FailedDuetoAttendance("Failed Due to Attendance >>  ")
    var failedDM = Result.Fail.FailedDuetoMarks("Failed Due to Marks >>  ")

    getData(success)
    getData(error)
    getData(loading)

    getData(failedDA)
    getData(failedDM)


}

//Step 2: write all possibilities using when and Is
//it will give error like this
//'when' expression must be exhaustive, add necessary
// 'is Error', 'is Loading', 'is Success' branches or 'else' branch instead
fun getData(result: Result){
    when(result){
        is Result.Success -> println("Result : "+result.message)
        is Result.Error -> println("Result : "+result.message)
        is Result.Loading -> println("Result : "+result.message)
        is Result.Fail.FailedDuetoAttendance -> println("Result : "+result.message)
        is Result.Fail.FailedDuetoMarks -> println("Result : "+result.message)
    }
}

sealed class Result(var message : String){


    //Step 1 : Declare the subclasses here
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
    class Loading(message: String) : Result(message)

    sealed class Fail(message: String) : Result(message){
        class FailedDuetoAttendance(message: String) : Fail(message)
        class FailedDuetoMarks(message: String) : Fail(message)
    }


}
