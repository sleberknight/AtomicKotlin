package creatingClasses2

fun isPalIgnoreCase(s: SimpleString): Boolean {
    val midpointIndex = s.length() / 2
        val lastIndex = s.length() - 1

        for (i in 0..midpointIndex) {
            if (s.get(i).toLowerCase() != s.get(lastIndex - i).toLowerCase()) {
                return false
            }
        }

        return true
}

fun main(args: Array<String>) {
    println(isPalIgnoreCase(SimpleString("Mom")))
}
/* Output:
true
*/