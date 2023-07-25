package codewars

fun getCount(str : String) : Int = str.toCharArray().count { listOf('a', 'e', 'i', 'o', 'u').contains(it) }