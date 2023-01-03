package functions.lambda_functions

//  with type annotation in lambda expression
val sum1 = {a: Int, b: Int -> a + b}

//  without type annotation in lambda exression
val sum2: (Int, Int) -> Int = {num1, num2 ->
    num1 + num2
}

fun main() {

    val result1 = sum1(15, 10)
    val result2 = sum2(5, 4)

    println("Result 1 : $result1, Result 2 : $result2")

    //  printing the values without storing them in a variable
    println(sum1(5, 8))
}