package AccessModifiers

// Public class - Accessible from anywhere
open class PublicClass {
    // Public property - Accessible from anywhere
    public var publicProperty: String = "I am public"

    // Private property - Accessible only within this class
    private var privateProperty: String = "I am private"

    // Protected property - Accessible only within this class and subclasses
    protected var protectedProperty: String = "I am protected"

    // Internal property - Accessible only within the same module
    internal var internalProperty: String = "I am internal"

    // Public method - Accessible from anywhere
    fun showProperties() {
        println("Public Property: $publicProperty")
        println("Private Property: $privateProperty")
        println("Protected Property: $protectedProperty")
        println("Internal Property: $internalProperty")
    }
}

// Subclass within the same module
class SubClass : PublicClass() {
    fun accessProperties() {
        // Accessing properties in the subclass
        println("Public Property: $publicProperty")
        // println("Private Property: $privateProperty") // won't allow / Cannot access private property
        println("Protected Property: $protectedProperty")
        println("Internal Property: $internalProperty")
    }
}

// Different file or module
fun main() {
    val publicClass = PublicClass()
    publicClass.showProperties()

    // Accessing properties from outside the class
    println("Public Property: ${publicClass.publicProperty}")
    // println("Private Property: ${publicClass.privateProperty}") // won't allow / Cannot access private property
    // println("Protected Property: ${publicClass.protectedProperty}") // won't allow / Cannot access protected property
    // println("Internal Property: ${publicClass.internalProperty}") // won't allow / Cannot access internal property

    val subClass = SubClass()
    subClass.accessProperties()
}