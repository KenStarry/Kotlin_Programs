package codewars

fun String.findFire() = "\\bFire\\b".toRegex().containsMatchIn(this)

fun fireFight(s: String): String {

    val arr = s.split(" ").toMutableList()

    arr.forEachIndexed { index, word ->
        if (word == "Fire") {
            arr[index] = "~~"
        }
    }

    return arr.joinToString(" ")
}