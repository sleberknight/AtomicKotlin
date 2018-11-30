package repetitionwithwhile2

fun sumOfEven(n: Int): Int {
    var i = 2
    var sum = 0
    while (i <= n) {
        sum += i
        i += 2
    }

    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}