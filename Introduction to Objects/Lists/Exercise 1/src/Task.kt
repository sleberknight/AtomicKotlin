package lists1

import atomictest.eq

fun findMax(list: IntList): Int {
    if (list.size() == 0) {
        return 0
    }

    var max = Int.MIN_VALUE
    for (num in list) {
        if (num > max) {
            max = num
        }
    }

    return max
}

fun main(args: Array<String>) {
    val list = IntList(listOf(1, 2, 3, 2))
    findMax(list) eq 3
}