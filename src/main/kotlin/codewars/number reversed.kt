package codewars

object Kata {
    fun digitize(n:Long):IntArray {
        return n.toString().toCharArray().reversed().map { it.toString().toInt() }.toIntArray()
    }
}

fun main() {
    println(Kata.digitize(35321).toString())
}