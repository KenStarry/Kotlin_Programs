package solid_principles.isp

interface CanSwim {
    fun swim()
}

interface CanFly {
    fun fly()
}

class Ducky : CanSwim, CanFly {
    override fun swim() {
        println("I can swim!")
    }

    override fun fly() {
        println("I can also fly!")
    }
}