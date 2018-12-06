package creatingClasses1

fun isPalindrome(s: SimpleString): Boolean {
    val midpointIndex = s.length() / 2
    val lastIndex = s.length() - 1

    for (i in 0..midpointIndex) {
        if (s.get(i) != s.get(lastIndex - i)) {
            return false
        }
    }

    return true
}

fun main(args: Array<String>) {
    println(isPalindrome(SimpleString("mom")))
    println(isPalindrome(SimpleString("mom!")))
}
/* Output:
true
*/