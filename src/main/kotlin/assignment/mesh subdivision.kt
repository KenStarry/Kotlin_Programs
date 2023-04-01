package assignment

data class Point(
    val x: Double,
    val y: Double
)

data class Triangle(
    val p1: Point,
    val p2: Point,
    val p3: Point
) {

    fun subdivide(): List<Triangle> {
        val point1 = Point(
            x = (p1.x + p2.x) / 2,
            y = (p1.y + p2.y) / 2
        )

        val point2 = Point(
            x = (p2.x + p3.x) / 2,
            y = (p2.y + p3.y) / 2
        )

        val point3 = Point(
            x = (p3.x + p1.x) / 2,
            y = (p3.y + p1.y) / 2
        )

        return listOf(
            Triangle(p1, point1, point3),
            Triangle(p2, point2, point1),
            Triangle(p3, point3, point2),
            Triangle(point1, point2, point3)
        )
    }

}

fun main() {

    val triangle = Triangle(
        p1 = Point(0.0, 0.0),
        p2 = Point(1.0, 0.0),
        p3 = Point(0.5, 1.0)
    )

    val subdividedTriangles = triangle.subdivide()

    println("Original Triangle \n $triangle")
    println("Subdivided Triangles")
    subdividedTriangles.forEach { tri ->
        println(tri)
    }
}


























