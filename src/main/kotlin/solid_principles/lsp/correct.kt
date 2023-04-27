package solid_principles.lsp


open class Birdy {
    //  bird methods and properties go here.
}

interface IsFlyingBird {
    fun fly(): Boolean
}

class Penguiny : Birdy(), IsFlyingBird {
    //  methods and properties specific to penguins
    override fun fly(): Boolean {
        return false
    }
}

class Eagle : Birdy(), IsFlyingBird {
    override fun fly(): Boolean {
        return true
    }
}

fun canTheBirdFly(isFlyingBird: IsFlyingBird) {
    if (isFlyingBird.fly()) {
        println("Yes, the bird can fly!")
    } else {
        println("Naah, the bird can't fly!")
    }
}

fun main() {

    canTheBirdFly(Penguiny())
}





















