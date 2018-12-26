package propertyAccessors3

import atomictest.eq

class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
    private val hamsters =
            mutableListOf<Hamster>()

    fun getCapacity(): Int = maxCapacity - hamsters.size

    fun isFull(): Boolean = hamsters.size == maxCapacity

    fun put(hamster: Hamster): Boolean =
            if(isFull())
                false
            else {
                hamsters += hamster
                true
            }

    fun takeHamster(): Hamster =
            hamsters.removeAt(0)
}

fun main(args: Array<String>) {
    val cage = Cage(maxCapacity = 2)
    cage.isFull() eq false
    cage.getCapacity() eq 2
    cage.put(Hamster("Alice")) eq true
    cage.put(Hamster("Bob")) eq true
    cage.isFull() eq true
    cage.getCapacity() eq 0
    cage.put(Hamster("Charlie")) eq false
    cage.takeHamster()
    cage.getCapacity() eq 1
}