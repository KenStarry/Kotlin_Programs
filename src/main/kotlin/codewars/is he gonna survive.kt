package codewars

fun hero(bullets: Int, dragons: Int) : Boolean = bullets / 2 >= dragons

fun main() {
    println(hero(10, 5))
}