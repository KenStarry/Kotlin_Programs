package solid_principles.ocp

//  Here, we have divided our SystemManager class into parts
//  and placed the functions in their respective classes

interface ShapeInterface {
    fun area(): Double
}

class Rectangle(
    private val width: Double,
    private val height: Double
) : ShapeInterface {
    override fun area(): Double {
        return width * height
    }
}

class Circle(
    private val radius: Double
): ShapeInterface {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun calculateArea(shape: ShapeInterface) {
    println("Area = ${shape.area()}")
}

fun main() {

    val circle = Circle(7.0)
    calculateArea(circle)
}








































