package classes

typealias bool = Boolean
typealias onPrint = (message: String) -> Unit

fun sayHello(
    isLegible: bool,
    onPrint: onPrint
) {
   if (isLegible)
       onPrint("Hello there stranger")
}

fun main() {

    println("Enter age : ")
    val age = readln().toInt()

    if (age > 18)
        sayHello(
            isLegible = true,
            onPrint = { println(it) }
        )
    else
        println("You are too young!")
}