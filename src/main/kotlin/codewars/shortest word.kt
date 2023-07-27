package codewars

fun findShort(s: String): Int? = s.split(" ").toList().map { it.length }.toList().minByOrNull { it }

fun main() {
    println(findShort("Ken is awesome"))
}