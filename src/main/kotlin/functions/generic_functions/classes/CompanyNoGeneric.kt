package functions.generic_functions.classes

class CompanyNoGeneric(companyName: String) {

    var name = companyName

    init {
        println("Company name is : $name ltd.")
    }
}

fun main() {
    CompanyNoGeneric("Kenstarry")
}