package Collection

fun main() {

    var human =Human("Madan","NYC",26)
    var human1 =Human("ABC","XXX",26)
    var human2 =Human("EFG","AAA",26)
    var human3 =Human("HIJ","ABB",26)
    var human4 =Human("KLM","CCC",26)

    var humanMap = mapOf<Int, Human>(1 to human,
        2 to human1, 3 to human2, 4 to human3, 5 to human4
        )

    humanMap.entries.forEach { println(it) }
    humanMap.keys.forEach { println(it) }
    humanMap.values.forEach { println(it) }

}