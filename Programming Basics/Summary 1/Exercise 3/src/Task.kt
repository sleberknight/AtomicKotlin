package summary3

fun printPyramid(n: Int) {
    var spaces = n - 1
    for (i in 1..(n * 2) step 2) {
        print(" ".repeat(spaces))
        println("#".repeat(i))
        spaces -= 1
    }
}

fun main(args: Array<String>) {
    printPyramid(4)
}
/* Output:
   #
  ###
 #####
#######
*/

fun printChristmasTree(height: Int) {
    val initialSpaces = height - 1
    var spaces = initialSpaces

    // tree
    for (i in 1..(height * 2) step 2) {
        print(" ".repeat(spaces))
        println("#".repeat(i))
        spaces -= 1
    }

    // trunk
    print(" ".repeat(initialSpaces))
    println("#")

    // stand
    val standChars = if (initialSpaces - 1 > 0) initialSpaces - 1 else 0
    print(" ".repeat(standChars))
    println("###")
}
