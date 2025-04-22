package OOP_Concepts


class Worker(val name :String, val companyName:String){

    var salary : Int = 0

    constructor(name: String, companyName: String, salary:Int) : this(name, companyName){
        this.salary = salary
    }

    override fun toString(): String {
        return "Worker(name='$name', companyName='$companyName', salary=$salary)"
    }
}



fun main(){

    val worker = Worker("ABC", "ASFDG")
    println(worker)
    val worker1 = Worker("", "", 23)



}