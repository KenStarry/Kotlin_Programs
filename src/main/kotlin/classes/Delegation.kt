package classes

interface Nameable {
    var name: String
}

class JackName : Nameable {
    override var name: String = "Starry"
}

class LongDistanceRunner : Runnable {
    override fun run() {
        println("running")
    }
}

class Person(
    name: Nameable,
    runner: Runnable
) : Nameable by name, Runnable by runner

fun main() {

    val person: Person = Person(JackName(), LongDistanceRunner())

    println(person.name)
    person.run()
}