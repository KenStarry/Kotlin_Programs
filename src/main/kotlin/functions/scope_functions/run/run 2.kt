package functions.scope_functions.run

fun main() {

    val name: String?

    name = readLine()!!.toString()

    name?.run {
        println("The length of your name is : ${this.length}")
    }
}