package functions.scope_functions.let_and_also

fun main() {

    val original = "abc"

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


}