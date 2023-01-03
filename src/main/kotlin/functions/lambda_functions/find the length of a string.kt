package functions.lambda_functions

//  function that finds the length of a string
fun myName(
    name: String,
    age: Int,
    lengthOfName: (String) -> Unit,
    anotherFunc: (Int) -> Unit
) {

    val fullName = "$name Michuki"

    lengthOfName(fullName)
    anotherFunc(age)
}

fun main() {

    myName("Kenneth", 22, {

        //  It will use the full name
        val length = it.length
        println("Hello $it Length -> $length.")

    }, {

        //  This second function uses the age
        println("$it is too old for you.")
    })
}