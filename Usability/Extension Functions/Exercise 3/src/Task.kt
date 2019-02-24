package extensionFunctions3

import atomictest.eq

class Rectangle(
        val x: Int,
        val y: Int,
        val width: Int,
        val height: Int
) {
    override fun toString(): String {
        return "[x=$x, y=$y, width=$width, height=$height]"
    }
}

fun Rectangle.coversZero(): Boolean =
        x <= 0 && (x + width) >=0 && y <= 0 && (y + height) >= 0

fun main(args: Array<String>) {
    val first = Rectangle(-1, -1, 2, 2)
    val second = Rectangle(1, 1, 2, 2)
    first.coversZero() eq true
    second.coversZero() eq false
}