package codewars

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
    var isContained = true
    for (s in arr) {
        if (s.lowercase().toCharArray().sort().toString() != strng) {
            isContained = false
            break
        }
    }

    return isContained
}