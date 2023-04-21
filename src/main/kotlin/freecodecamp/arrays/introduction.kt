package freecodecamp.arrays

fun main() {

    val names = arrayOf("John", "Stephen", "Meghan")
    val numbers = arrayOf(1, 2, 4, 5, "Starry", 'a')

    names[0] = "Starry"
    println("First element : ${names[0]}")

    numbers.forEachIndexed { index, num ->

        if (num is String) {
            println(num)
        }
    }
}