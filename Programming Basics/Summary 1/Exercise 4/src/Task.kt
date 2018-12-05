package summary4

fun printSnake(rows: Int, columns: Int) {
    val width = (rows * columns).toString().length + 1

    for (row in 0 until rows) {
        for (col in 0 until columns) {
            val current = if (even(row)) {
                (row * columns) + col
            } else {
                (row * columns) + (columns - col - 1)
            }
            print("%${width}d".format(current))
        }
        println()
    }
}

private fun even(num: Int) = num % 2 == 0

fun main(args: Array<String>) {
    printSnake(4, 5)
}
/* Output:
  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/