package freecodecamp.oop

fun main() {

    val car1 = Car("Tesla", "S Plaid", "Red", 4)

    println("name -> ${car1.name}\n" +
            "model -> ${car1.model}\n" +
            "color -> ${car1.color}\n" +
            "doors -> ${car1.doors}\n")
}

class Car(var name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("The car is moving")
    }

    fun stop() {
        println("The car has stopped")
    }
}