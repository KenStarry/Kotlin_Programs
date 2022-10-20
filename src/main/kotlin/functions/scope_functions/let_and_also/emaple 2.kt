package functions.scope_functions.let_and_also

import java.io.File

fun main() {

}

//  Function to make a directory
fun makeDir(path: String): File {
    val result = File(path)
    result.mkdirs()

    return result
}

//  The improved approach
fun makeDirImproved(path: String) = path.let { File(it) }.also { it.mkdirs() }