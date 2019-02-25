package whenExpressions2

import atomictest.eq

fun getTemperatureDescription(temperature: Int): String =
        when {
            temperature < -5 -> "Freezing"
            temperature in -5..4 -> "Cold"
            temperature in 5..14 -> "Cool"
            temperature in 15..24 -> "Warm"
            else -> "Hot"
        }

fun main(args: Array<String>) {
    getTemperatureDescription(30) eq "Hot"
    getTemperatureDescription(10) eq "Cool"
    getTemperatureDescription(-30) eq "Freezing"
}