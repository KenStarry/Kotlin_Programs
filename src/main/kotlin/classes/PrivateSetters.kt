package classes

class PrivateSetters {

    var name = "Starry"
        private set

    fun myFunction(n: String) {
        this.name = n
    }
}

fun main() {

    val c = PrivateSetters()

    //  This line returns an error as you cannot modify the name as it's setter is private
    //  c.name = "Ken"

    //  However, the getter remains public hence can be accessed from anywhere
    println("Hello ${c.name}")

    c.myFunction("Ken")
    println("Hello again ${c.name}")
}