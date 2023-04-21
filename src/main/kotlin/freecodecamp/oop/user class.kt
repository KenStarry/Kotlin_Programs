package freecodecamp.oop

fun main() {

    val user = User("Starry", "Michuki", 22)
}

class User(name: String, var lastName: String, var age: Int) {

    lateinit var name: String

    init {
        if (name.lowercase().startsWith('a'))
            this.name = name
        else {
            this.name = "User"
            println("Name doesn't start with the letter 'a' or 'A'")
        }
    }

    //  you can have more than one initializer block
    init {
        println("Hello")
    }
}