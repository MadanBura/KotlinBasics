package Function

fun main() {
    // Testing getUpperFirstLetter
    val str = "hello"
    str.getUpperFirstLetter()  // Output: Hello

    // Testing getFirstLetterUppercaseEachWord
    val st = "tomorrow is holiday, so exam is postponed"
    println(st.getFirstLetterUppercaseEachWord())  // Output: Tomorrow Is Holiday, So Exam Is Postponed
}

// Extension function to capitalize the first letter of a single string and print it
fun String.getUpperFirstLetter() {
    println(this.substring(0, 1).uppercase() + this.substring(1))
}

// Extension function to capitalize the first letter of each word in a string
fun String.getFirstLetterUppercaseEachWord(): String {
    return this.split(" ")
        .joinToString(" ") { it.substring(0, 1).uppercase() + it.substring(1) }
}
