package namedandDefaultArguments2

import atomictest.eq

fun joinComments(s: String): String =
        s.trimMargin(marginPrefix = "// ")
                .lines()
                .joinToString(separator = "; ")

fun main(args: Array<String>) {
    val s = """
        // first
        // second
        // third
        """
    joinComments(s) eq "first; second; third"
}