package functions.scope_functions.let_and_also

fun main() {

    val original = "abc"

    //  Using Let
    //  Evolve the value and send to the next chain
    original.let {

        println("The original string is $it")
        //  Reverse the text
        it.reversed()

    }.let {

        println("The reversed string is : $it")
        it.length

    }.let {

        println("The length of the string is : $it")
    }

    //  Using also
    val original2 = "xyz"

    original2.also {
        println("Original2 version 1 : $it")
    }.also {
        println("Original2 reversed : ${it.reversed()}")
    }.also {
        println("Original2 reversed : ${it.length}")
    }

}