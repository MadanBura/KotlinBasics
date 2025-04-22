package OOP_Concepts


/*
Limited set of known values: When you have a small, well-defined set of constants.
Type safety: Enums enforce that only valid values are used, reducing bugs.
 */

fun main() {

    for ( dir in Direction.values()){
        println(dir)
    }

    //to access the parameters passed inside the enum constructor
    println(Direction.NORTH.dir)
    println(Direction.NORTH.distance)

}

enum class Direction(var dir : String, var distance : Int){
    NORTH("north",25),
    SOUTH("south", 50),
    EAST("east", 75),
    WEST("west", 100)
}