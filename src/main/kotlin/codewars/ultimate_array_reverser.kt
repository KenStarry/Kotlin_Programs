package codewars

fun reverse(a: List<String>): List<String> {

    var reversedString = a.joinToString(separator = "").reversed()
    val reversedList = mutableListOf<String>()

    a.forEach { word ->
        reversedList.add(reversedString.take(word.length))
        reversedString = reversedString.drop(word.length)
    }

    return reversedList
}

fun main() {
    println(reverse(listOf("I", "like", "big", "butts", "and", "I", "cannot", "lie!")))
}