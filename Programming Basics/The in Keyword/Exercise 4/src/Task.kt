package theinKeyword4

fun isValidCharacter(ch: Char): Boolean {
    return ch == '_' ||
            ch in 'a'..'z' ||
            ch in 'A'..'Z' ||
            ch in '0'..'9'
}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s.first() in '0'..'9') return false

    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}