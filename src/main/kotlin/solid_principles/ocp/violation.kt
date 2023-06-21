package solid_principles.ocp

//  OCP
//  Here, when we try to add something new to our class,
//  we have to rewrite our existing code, which can cause problems later on.
class Shape(
    val type: String,
    val width: Double,
    val height: Double
)

fun calculateArea(shape: Shape): Double {

    if (shape.type == "rectangle") {
        return shape.width * shape.height

    } else if (shape.type == "circle") {
        return Math.PI * shape.width * shape.width

    }

    return 0.0
}































