package functions.lambda_functions

fun pass_to_me(

    give_me_values: (x: Int, y: Int) -> Unit
) {

    val a = 5
    val b = 10

    give_me_values(a, b)
}

fun main() {

    pass_to_me(give_me_values = { _, b ->

    })

    pass_to_me { a, b ->

        println(a + b)
    }
}