package freecodecamp.oop

fun main() {

    val user = Student("Kenny")
}

class Student(var name: String, var lastName: String, var age: Int) {

    //  secondary constructors don't take in properties, the can only declare parameters
    //  all secondary constructors need to call the primary constructor
    constructor(name: String) : this(name, "Last Name", 0) {
        //  code executed when we create an object with this constructor
        println("Only one name provided")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 0)
}