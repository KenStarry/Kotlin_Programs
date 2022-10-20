package functions.scope_functions.let

//  Let returns a different type of value
fun main() {

    val name: String?

    name = readLine()!!.toString()

    name?.let {
        println("Hello there $it")
    }
}