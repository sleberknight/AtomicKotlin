package theImportanceofLambdas1

import atomictest.eq

class Person(val name: String, val age: Int)

fun List<Person>.getNamesOfAdults(): List<String> {
    return filter { it.age > 17 }.map { it.name }
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 17), Person("Bob", 19))
    people.getNamesOfAdults() eq listOf("Bob")
}