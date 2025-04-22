package OOP_Concepts

// Covariant Interface (out T)
interface IProducer<out T> {
    fun produce(): T
}

// Contravariant Interface (in T)
interface IConsumer<in T> {
    fun consume(obj: T)
}

// Base class
open class Base {
    open fun doSomething() {
        println("Doing something from ${this::class.simpleName}")
    }
}

// Derived class extending Base
class Derived : Base() {
    fun doMore() {
        println("Doing more from ${this::class.simpleName}")
    }
}

fun main() {

    // Covariant Example
    val producer: IProducer<Base> = object : IProducer<Derived> {
        override fun produce(): Derived {
            return Derived()
        }
    }
    val base: Base = producer.produce()
    base.doSomething() // Works because of covariance

    // Contravariant Example
    val consumer: IConsumer<Derived> = object : IConsumer<Base> {
        override fun consume(obj: Base) {
            obj.doSomething()
        }
    }
    val derived = Derived()
    consumer.consume(derived)

    // Covariant Example with IProducer<Base>
    val prodOfBase: IProducer<Base>? = null
    val a: Base? = prodOfBase?.produce()

    // Covariant Example with IProducer<Derived>
    val prodOfDerived: IProducer<Derived>? = null
    val b: Derived? = prodOfDerived?.produce()
    val c: Base? = prodOfDerived?.produce()

    // Contravariant Example with IConsumer<Base>
    val consOfBase: IConsumer<Base>? = null
    consOfBase?.consume(Base())
    consOfBase?.consume(Derived())

    // Contravariant Example with IConsumer<Derived>
    val consOfDerived: IConsumer<Derived>? = null
    consOfDerived?.consume(Derived())


    val p: IProducer<Base>? = prodOfBase
// This is valid because `prodOfBase` is of type `IProducer<Base>`.

    val q: IProducer<Derived>? = prodOfDerived
// This is valid because `IProducer<Derived>` can be assigned to `IProducer<Base>` due to covariance.

    val r: IProducer<Derived>? = prodOfDerived
// This is valid because both `r` and `prodOfDerived` are of type `IProducer<Derived>`.

// val s: IProducer<Derived> = prodOfBase
// This is NOT valid because `IProducer<Base>` cannot be assigned to `IProducer<Derived>`.
// Covariance only allows assigning `IProducer<Derived>` to `IProducer<Base>`, not the other way around.

    val t: IConsumer<Derived>? = consOfDerived
// This is valid because `consOfDerived` is of type `IConsumer<Derived>`.

    val u: IConsumer<Derived>? = consOfBase
// This is valid because `IConsumer<Base>` can be assigned to `IConsumer<Derived>` due to contravariance.

    val v: IConsumer<Base>? = consOfBase
// This is valid because both `v` and `consOfBase` are of type `IConsumer<Base>`.

// val w: IConsumer<Base> = consOfDerived
// This is NOT valid because `IConsumer<Derived>` cannot be assigned to `IConsumer<Base>`.
// Contravariance only allows assigning `IConsumer<Base>` to `IConsumer<Derived>`, not the other way around.







}
