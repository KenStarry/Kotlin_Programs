package codewars

fun catMouse(s: String): String {
    val count = s.drop(1).dropLast(1).replace(" ", "").length

    return if (count > 3) "Escaped!" else "Caught!"
}