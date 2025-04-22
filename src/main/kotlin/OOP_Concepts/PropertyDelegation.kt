package OOP_Concepts

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//Built-In
//Custom-In

fun mainA() {
    name = "Madan"
    name = "ABCD"
}

var name: String by Delegates.observable("Default"){
    property, oldValue, newValue ->
    println("Name changed from $oldValue to $newValue")
}


class UppercaseDelegate(var value: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return value.toUpperCase()
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        this.value = value
    }
}

class Persons{
    var name: String by UppercaseDelegate("default")
}

/*
Property delegation in Kotlin allows you to delegate the logic
for getting and setting a property to another object
 The most common use case is the built-in by keyword,
which can delegate property access to another object or function.
 */
/*
Interface Delegation is useful when you want to share or reuse interface implementations
across different classes, enabling flexible composition and reducing code duplication.

Property Delegation is ideal when you need to encapsulate complex property logic,
such as lazy initialization, observability, or custom getters/setters,
making your code more modular and reusable.
 */



fun main() {
    val person = Persons()
    println(person.name) // Output: DEFAULT
    person.name = "john"
    println(person.name) // Output: JOHN
}
