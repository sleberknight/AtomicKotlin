package numberTypes4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
        (((hours * 60L + minutes) * 60L) + seconds) * 1_000L

fun main(args: Array<String>) {
    println(convertToMilliseconds(1, 30, 0))
}