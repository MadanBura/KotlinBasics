package OOP_Concepts

fun main() {

    var obj = Test("Madan")

    println(obj)

}

class Test(var name: String, var dept : String = "DefaultValue", var deptNo : Int = 0){



    override fun toString(): String {
        return "Test(name='$name', dept='$dept', deptNo=$deptNo)"
    }
}