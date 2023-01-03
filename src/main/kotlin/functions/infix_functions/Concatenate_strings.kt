package functions.infix_functions

//  infix function to concatenate two strings
infix fun String.concat(name: String): String {
    return this + name
}

fun main() {
    val name = readln()

    //  calling our infix function
    val greeting = "Hello there " concat name

    println(greeting)
}