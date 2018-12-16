package lists2

fun countOccurrences(list: IntList, number: Int): Int {
    var count = 0

    for (element in list) {
        if (element == number) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val list = IntList(listOf(1, 2, 3, 2))
    println(countOccurrences(list, 2))  // 2
}