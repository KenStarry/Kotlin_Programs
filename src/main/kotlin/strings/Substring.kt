package strings

val name = "Sheilla(Chichi)"

fun main() {

    println(
        name.substringAfter("(")
            .substringBefore(")")
    )
}