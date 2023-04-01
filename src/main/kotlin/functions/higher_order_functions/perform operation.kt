package functions.higher_order_functions

fun performOperation(
    x: Int,
    y: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(x, y)
}

fun add(
    x: Int,
    y: Int
) = x + y

fun main() {

    val result = performOperation(10, 15, ::add)
    println(result)
}