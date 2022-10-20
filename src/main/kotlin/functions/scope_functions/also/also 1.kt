package functions.scope_functions.also

//  T.also returns the T itself i.e. this
//  T.also lets you perform things on the same object whereas T.let lets you evolve the operation
fun main() {
    var name: String?

    name = readLine()!!.toString()

    name?.also {

        //  Performing things on the String object itself
        it.trim()
        println("Hello there $it")
    }
}