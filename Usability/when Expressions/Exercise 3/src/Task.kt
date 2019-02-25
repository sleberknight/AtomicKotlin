package whenExpressions3

import atomictest.capture
import atomictest.eq

fun isBalanced(input: String): Boolean {
    var unmatchedLeftBraces = 0
    for (ch in input) {
        when {
            unmatchedLeftBraces < 0 -> return false
            ch == '(' -> ++unmatchedLeftBraces
            ch == ')' -> --unmatchedLeftBraces
            ch == ' ' -> { /* ignore the space */ }
            else -> throw IllegalArgumentException("Illegal character")
        }
    }

    return unmatchedLeftBraces == 0
}

fun main(args: Array<String>) {
    isBalanced("(()) ()") eq true
    isBalanced(")(") eq false
    isBalanced(") ( )") eq false
    isBalanced("( ( ( )))") eq true
    isBalanced("( ( () ) )") eq true
    isBalanced("( ( () ) ) )") eq false
    capture {
        isBalanced("this is totally invalid")
    } eq "IllegalArgumentException: Illegal character"
}