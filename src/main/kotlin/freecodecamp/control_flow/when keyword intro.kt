package freecodecamp.control_flow

fun main() {

    val alarm = readln().toInt()

    val text = when {
//        alarm is 12, 7, 14 -> "Alarm is set to $alarm"

        alarm == 1 || alarm == 12 -> "Nice numbers"

        alarm == 30 -> "Alarm is set to $alarm"

        alarm in 1..10 -> "Alarm is set to 1 to 10"

        else -> "Nothing found"
    }
}