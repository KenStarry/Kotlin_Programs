package codewars

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> =
    if (input.isNullOrEmpty()) emptyArray() else arrayOf(
        input.count { it > 0 },
        input.filter { it < 0 }.fold(0) { acc, num ->
            acc + num
        })