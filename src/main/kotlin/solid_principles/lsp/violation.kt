package solid_principles.lsp

//  Single Responsibility Principle
//  Here, the method we wrote in our main class 'Bird' should work properly
//  in its subclasses, but when our subclass is inherited from the super class,
//  our fly method didn't work as expected
open class Bird {
    open fun fly() {}
}

class Penguin : Bird() {
    override fun fly() {
        println("Penguins can't fly")
    }
}

