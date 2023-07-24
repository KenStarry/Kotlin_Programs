package codewars

fun highAndLow(numbers: String): String {
    val myArr = numbers.split(" ").map { Integer.parseInt(it) }

    print(myArr)
    return "${myArr.maxOrNull()} ${myArr.minOrNull()}"
}

fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}