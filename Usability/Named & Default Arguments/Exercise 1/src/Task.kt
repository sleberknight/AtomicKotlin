package namedandDefaultArguments1

import atomictest.eq

class SimpleTime(
        val hours: Int = 0,
        val minutes: Int = 0,
        val seconds: Int = 0,
        val nanoseconds: Int = 0
) {
    fun toSecondOfDay(): Int =
            (3600 * hours) + (60 * minutes) + seconds

    fun toNanoOfDay(): Long =
            (toSecondOfDay() * 1_000_000_000L) + nanoseconds
}

fun main(args: Array<String>) {
    val noon = SimpleTime(12)
    noon.toSecondOfDay() eq 12 * 60 * 60

    val halfPastSeven = SimpleTime(hours = 6, minutes = 30)
    halfPastSeven.toNanoOfDay() eq 23400000000000

    val nanosecond = SimpleTime(nanoseconds = 1)
    nanosecond.toNanoOfDay() eq 1

    val second = SimpleTime(seconds = 1)
    second.toNanoOfDay() eq 1000000000
}
