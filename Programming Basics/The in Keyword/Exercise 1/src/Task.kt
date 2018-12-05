package theinKeyword1

fun getAlphabet(): String {
    val sb = StringBuilder()
    for (c in 'a'..'z') {
        sb.append(c)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}