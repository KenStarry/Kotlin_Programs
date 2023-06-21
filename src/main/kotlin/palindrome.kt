fun main() {

    val name = "omo"

    print("Is $name a palindrome? ${checkPalindrome(name)}")
}

fun checkPalindrome(value: String): Boolean {
    val reversedString = value.reversed()

    return value == reversedString
}