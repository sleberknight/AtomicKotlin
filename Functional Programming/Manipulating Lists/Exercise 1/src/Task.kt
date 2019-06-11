package manipulatingLists1

import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> =
        this.zip(0 until this.size)  // solution uses indices method of Collections.kt

fun main(args: Array<String>) {
    val list = listOf('a', 'b', 'c')
    list.zipWithIndex() eq
            "[(a, 0), (b, 1), (c, 2)]"
}