package starry_snippets

fun main() {

    val name: String? = null

    //  method 1 using let
    name?.let {
        println("The name is $it")
    }

    //  method 2 using assertion operators (not recommended)
    println("The name is ${name!!}")

    //  method 3 - if statement
    if (!name.isNullOrEmpty()) {
        println("The name is $name")
    }

    //  method 4 - if statement 2
    if (name != null) {
        println("The name is $name")
    }
}