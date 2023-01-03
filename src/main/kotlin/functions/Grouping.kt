package functions

import java.util.*

data class Todo(
    val taskName: String,
    val status: String
)

fun main() {

    var taskList = listOf(
        Todo("Go Home", "Complete"),
        Todo("Take a walk", "Complete"),
        Todo("Text Spongebob", "Incomplete"),
        Todo("Sing a Song", "Complete"),
        Todo("Drive a maybach", "Incomplete"),
    )

    //  group tasks according to status count
    val taskByStatusCount = taskList.groupingBy { it.status }.eachCount()
    //  grouping tasks on whether they are complete or not
    val taskByStatus = taskList.groupBy({ it.status }, {it.taskName})

    println("Taks By status count -> $taskByStatusCount")
    println("Taks By status -> $taskByStatus")

    val hobbies = listOf(
        "Swimming", "Dancing",
        "Drawing", "Driving", "Nature Walks"
    )

    //  Group according to the first letter
    println(hobbies.groupBy {
        it.first()
    })

    //  Group by the second character and transform to uppercase
    println(hobbies.groupBy({
        //  select second character
        it[1]
    }, {
        //  transform to uppercase
        it.uppercase(Locale.getDefault())
    }))
}