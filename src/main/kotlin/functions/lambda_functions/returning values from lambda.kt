package functions.lambda_functions

val find = fun (num: Int): String {

    if (num % 2 == 0 && num < 0)
        return "Number is even and negative"
    else if (num % 2 == 0 && num > 0)
        return "Number is odd and negative"
    else
        return "Number is odd and positive"
}

fun main() {
    println("Result is ${find(13)}")
}