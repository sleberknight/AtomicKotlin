package objectsEverywhere3

fun isPalindrome(s: String): Boolean = s == s.reversed()

fun isPalIgnoreCase(s: String): Boolean =
        isPalindrome(s.toLowerCase())

fun isPalIgnoreSpecial(s: String): Boolean {
    val lettersOnly = s.filter { it in 'a'..'z' || it in 'A'..'Z' }
    return isPalIgnoreCase(lettersOnly)
}

fun main(args: Array<String>) {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}