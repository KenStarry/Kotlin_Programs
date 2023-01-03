package functions.infix_functions


//  function to add two numbers
infix fun Int.plus(num: Int): Int {
    return this + num
}

fun main() {
    val addedNums = 15 plus 20

    println("15 + 20 = $addedNums")
}