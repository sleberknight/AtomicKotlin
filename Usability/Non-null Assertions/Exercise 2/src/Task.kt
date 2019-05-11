package nonnullAssertions2

import atomictest.eq
import kotlin.math.abs

fun maxEqualsMinInAbsoluteValue(list: List<Int>): Boolean {
    return when {
        list.isEmpty() -> false
        else -> abs(list.min() ?: 0) == abs(list.max() ?: 0)
    }
}

fun main(args: Array<String>) {
    maxEqualsMinInAbsoluteValue(listOf(-10, 1, 10)) eq true
    maxEqualsMinInAbsoluteValue(listOf(10, 10)) eq true
    maxEqualsMinInAbsoluteValue(listOf(-10, 1)) eq false
}