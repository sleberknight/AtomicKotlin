package lambdawithReceiver1

import atomictest.eq

fun drawSquare(width: Int) = buildString {
    repeat(width) {
        val row = "*".repeat(width)
        appendln(row)
    }
}.trim()

fun main(args: Array<String>) {
    drawSquare(3) eq
            """|***
               |***
               |***""".trimMargin()
}