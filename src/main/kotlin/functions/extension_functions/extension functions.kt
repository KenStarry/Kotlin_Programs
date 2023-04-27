package functions.extension_functions

fun String.getStringLength(): Int {
    return this.length
}

fun List<String>.getFirstAndLastItems(): String {
    return if (this.size == 1) {
        this[0]
    } else if (this.size > 1) {
        this[0] + this[this.lastIndex]
    } else {
        "list is too short"
    }
}

fun main() {

    val name = "KenStarry"
    val listOfStudents: List<String> = emptyList()

    println(name.getStringLength())
    println(listOfStudents.getFirstAndLastItems())
}