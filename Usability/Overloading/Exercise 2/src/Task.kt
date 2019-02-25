package overloading2

import atomictest.eq

fun f(n: Int = 0, i: Int) = n + i

fun main(args: Array<String>) {
    f(i = 373) eq 373
}