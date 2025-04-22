package Collection

class Human(var name:String, var city: String, var age:Int) {

    override fun toString(): String {
        return "Human(name='$name', city='$city', age=$age)"
    }
}