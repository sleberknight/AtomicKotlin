package summary21

import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        6 to "VI",
        7 to "VII",
        8 to "VIII",
        9 to "IX",
        10 to "X",
        20 to "XX",
        30 to "XXX",
        40 to "XL",
        50 to "L",
        60 to "LX",
        70 to "LXX",
        80 to "LXXX",
        90 to "XC",
        100 to "C",
        200 to "CC",
        300 to "CCC",
        400 to "CD",
        500 to "D",
        600 to "DC",
        700 to "DCC",
        800 to "DCCC",
        900 to "CM",
        1000 to "M",
        2000 to "MM",
        3000 to "MMM"
)

fun convertToRoman(number: Int): String {
    require(number > 0) { "number must be more than zero"}
    require(number < 4000) { "number must be 3,999 or less" }

    val romanFromMap = intToRomanNumeralMap[number]
    if (romanFromMap != null) {
        return romanFromMap
    }

    var factor = 1000
    var remaining = number
    val roman = StringBuilder()

    while (factor > 0) {
        val factorNumber = (remaining / factor) * factor

        if (factorNumber > 0) {
            roman.append(intToRomanNumeralMap.getValue(factorNumber))
        }

        remaining %= factor
        factor /= 10
    }

    return roman.toString()
}

fun main(args: Array<String>) {
    convertToRoman(23) eq "XXIII"
    convertToRoman(44) eq "XLIV"
    convertToRoman(100) eq "C"
    convertToRoman(2018) eq "MMXVIII"
}