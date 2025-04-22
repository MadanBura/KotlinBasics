package OOP_Concepts

interface Printer{
    fun printing(message:String)
}

class BasicPrinter : Printer{
    override fun printing(message: String) {
        println("Printing : ${message}")
    }
}

class AdvancePrinter : Printer{
    override fun printing(message: String) {
        println("Printing : ${message}")
    }
}

//Delegate
class DocumentPrinter(printer : Printer) : Printer by printer
/*
Interface delegation in Kotlin is a design pattern that allows a class to delegate the
implementation of one or more interfaces to another object.
Instead of implementing the interface methods yourself,
you can delegate them to an instance of another class that already implements the interface.
 */


fun main() {

    val basicPrinter = BasicPrinter();

    val documentPrinter = DocumentPrinter(basicPrinter)
    documentPrinter.printing("20 documents are printing >> ")
}