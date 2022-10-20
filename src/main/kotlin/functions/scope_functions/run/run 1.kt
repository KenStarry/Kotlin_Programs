package functions.scope_functions.run

fun main() {

    var mood = "I'm sad"

    //  The run function returns the last object within the scope
    run {
        val mood = "I'm happy"
        println("Scope mood : $mood")
    }
    println("Local mood : $mood")

    //  Checking the age of a person
    val old = true

    val output = run {
        if (old) "Old enough..." else "Too young..."
    }

    println(output)
}