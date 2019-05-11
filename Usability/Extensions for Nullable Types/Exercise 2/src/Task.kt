package extensionsforNullableTypes2

import atomictest.eq

fun Boolean?.and(that: Boolean?): Boolean? =
        when {
            this == null || that == null -> null
            else -> this && that
        }

fun Boolean?.or(that: Boolean?): Boolean? =
        when {
            this == null || that == null -> null
            else -> this || that
        }

fun main(args: Array<String>) {
    val b = true
    b.and(null) eq null
    null.or(b) eq null
    b.or(false) eq true
}