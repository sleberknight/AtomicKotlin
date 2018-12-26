package sets1

import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

fun percentOf(groceryCart: Set<String>, things: Set<String>) =
        100.0 * groceryCart.intersect(things).size / groceryCart.size.toDouble()

fun percentMeat(groceryCart: Set<String>): Double = percentOf(groceryCart, meats)

fun percentFruit(groceryCart: Set<String>): Double = percentOf(groceryCart, fruits)

fun percentVeggies(groceryCart: Set<String>): Double = percentOf(groceryCart, vegetables)

fun percentOther(groceryCart: Set<String>): Double =
       percentOf(groceryCart, groceryCart - meats - fruits - vegetables)

fun main(args: Array<String>) {
    val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
            "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

    percentMeat(groceryCart) eq 10.0
    percentFruit(groceryCart) eq 20.0
    percentVeggies(groceryCart) eq 50.0
    percentOther(groceryCart) eq 20.0
}