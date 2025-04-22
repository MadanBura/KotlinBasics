package Generics_in_out_where


fun main() {

//    val mug = Mug(Coffee.EXPRESSO)
//    drink(mug.bevarage)
//
//    val coffeeMug = CoffeeMug(Coffee.CUPPUCCINO)
//    drink(coffeeMug.coffee)
//
//
//    val teaMug = TeaMug(Tea.RED_TEA)
//    drink(teaMug.tea)

//The more bevarages add more mug classes needed
    //bcoz mug class is taking parameter of type individuals either tea or coffee
    //I have to make it common, if i have to pass one it will take both coffee an tea also

    val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)
    val mugOfTea = Mug(Tea.BLACK_TEA)


 //   drink(mugOfCoffee.beverage) --> it will give error
//Regardless of the beverage property’s actual type at runtime (e.g., Coffee in this example),
// it can be assigned neither to a parameter of type Coffee, nor to a parameter of type Tea,
// because its declared type is Beverage. In other words, beverage is not assignment-compatible
// with either of the drink() overloads. This is why Eric’s code is failing.

    //In order for this to compile without errors, he would need to cast the beverage
    drink(mugOfTea.beverage as Coffee)

    //When we assign an object to a variable, property, or parameter,
    // the actual or runtime type is irrelevant. Only the declared type matters.
//    val beverage: Beverage = Coffee.MEDIUM_ROAST
                //internally declared type is Beverage but at runtime actual type is Coffee
//    val coffee: Coffee = beverage
            //logically it should run but it won't
    //It means type bevarage possibly hold other bevarage's too




}




//enum class Coffee { CUPPUCCINO, LATTE, EXPRESSO, FIRST_WHITE }
//fun drink(coffee: Coffee) = println("Drinking coffee : $coffee")
//
////class Mug(val bevarage : Coffee)
//
//
//enum class Tea { GREEN_TEA, BLACK_TEA, RED_TEA }
//fun drink(tea: Tea) = println("Drinking tea: $tea")
//
//class CoffeeMug(val coffee: Coffee)
//class TeaMug(val tea :Tea)


sealed interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }


//Mug can take any bevarage of type coffee or tea
class Mug(val beverage: Beverage)
fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
fun drink(tea: Tea) = println("Drinking tea: $tea")




