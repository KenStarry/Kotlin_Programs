package functions.lambda_functions

fun main() {

    val companyName = { println("Hello world") }

    //  Lambda type 1
    val sum = {a: Int, b: Int ->

    }

    //  Lambda type 2
    val add: (Int, Int) -> Int = {a, b ->
        a + b
    }


}