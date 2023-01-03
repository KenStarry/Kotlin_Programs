package functions.lambda_functions

val lambda: String.(Int) -> String = {this + it}

//  Have a write up of the different types of interfaces used in Python
//  create a file chooser that can be used to select a file that is .java only in python
//  read the file line by line, check for nesting and semicolon
fun main() {
    val result = "Hello".lambda(50)

    println(result)
}