package codewars

fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
    var num = a
    val strArr = mutableListOf(num)

    repeat(n - 1) {
        num *= r
        strArr.add(num)
    }

    return strArr.joinToString()
}

fun main() {
    print(geometricSequenceElements(2, 3, 5))
}