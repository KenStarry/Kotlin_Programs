package solid_principles.isp


//  Single Responsibility Principle
//  Here, If we do everything inside a common interface,
//  we may have made unnecessary use in the places that implement our interface
interface Animal {
    fun swim()
    fun fly()
}

class Duck : Animal {
    override fun swim() {
        println("I can swim!")
    }

    override fun fly() {
        println("I can also fly!")
    }
}

class Penguin : Animal {
    override fun swim() {
        println("I can swim!")
    }

    override fun fly() {
        throw UnsupportedOperationException("sadly, I can't fly!")
    }
}