package loops

fun main() {

    //  Right angled Triangle
    for (i in 0 until 10) {

        for (j in 0 until 10) {

            if (j <= i) {
                print(" * ")
            }
        }

        println()
    }

}