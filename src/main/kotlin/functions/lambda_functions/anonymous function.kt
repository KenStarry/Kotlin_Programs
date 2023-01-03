package functions.lambda_functions

//  anonymous functions
val anonymous1 = fun (x: Int, y: Int): Int = x + y
val anonymous2 = fun (a: Int, b: Int): Int {
    val mul = a * b
    return mul
}

fun main() {
    //  Invoking the functions
    val sum1 = anonymous1(3,2)
    val mul = anonymous2(4, 6)

    println("The sum = $sum1 \nProduct = $mul")
}