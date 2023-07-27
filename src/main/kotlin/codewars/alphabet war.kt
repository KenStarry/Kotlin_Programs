package codewars

fun alphabetWar(fight: String): String {
    // code here
    val left = mapOf(
        'w' to 4,
        'p' to 3,
        'b' to 2,
        's' to 1,
    )
    val right = mapOf(
        'm' to 4,
        'q' to 3,
        'd' to 2,
        'z' to 1
    )
    var leftCount = 0
    var rightCount = 0

    fight.toCharArray().forEach { letter ->
        if (left.containsKey(letter)) {
            leftCount += left.getValue(letter)
        } else if (right.containsKey(letter)) {
            rightCount += right.getValue(letter)
        }
    }

    return if (leftCount > rightCount) {
        "Left side wins!"
    } else if (rightCount > leftCount) {
        "Right side wins!"
    } else {
        "Let's fight again!"
    }
}