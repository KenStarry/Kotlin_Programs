package functions.generic_functions.classes

/*
* accepts different type of parameters in single class.
* The class Company of type is a general type class that accepts both Int and String types of parameters.
*/
class CompanyGeneric<T>(companyName: T) {

    //  this variable will receive any type, not only a string type
    var name = companyName

    init {
        println("Company name is : $name ltd.")
    }
}

fun main() {
    var name = CompanyGeneric<String>("Kenstarry")
    var rank = CompanyGeneric<Int>(3)
}