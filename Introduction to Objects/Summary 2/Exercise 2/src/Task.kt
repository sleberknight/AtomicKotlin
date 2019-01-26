package summary22

import atomictest.eq

val romanNumeralToIntMap: Map<Char, Int> = mapOf(
        'M' to 1000,
        'D' to 500,
        'C' to 100,
        'L' to 50,
        'X' to 10,
        'V' to 5,
        'I' to 1
)

fun convertFromRoman(roman: String): Int {
    var result = 0
    var max = 0

    for (romanNumeral in roman.reversed()) {
        val value = romanNumeralToIntMap.getValue(romanNumeral)

        if (value >= max) {
            result += value
            max = value
        }
        else {
            result -= value
        }
    }

    return result
}

fun main(args: Array<String>) {
    convertFromRoman("XXIII") eq 23
    convertFromRoman("XLIV") eq 44
    convertFromRoman("C") eq 100
    convertFromRoman("MMXVIII") eq 2018
}