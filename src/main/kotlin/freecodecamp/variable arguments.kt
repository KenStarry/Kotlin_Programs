package freecodecamp

fun main() {

    println(sum(5, 6, 7, 8))

    println(sumVararg(12, 10, 22, 20, 56))
}

fun sum(a: Int, b: Int, c: Int,d: Int): Int {
    return a + b + c + d;
}

fun sumVararg(vararg numbers: Int): Int {
    //  loop through our numbers to add them together
    var result = 0

    numbers.forEach { num -> result += num }

    return result
}