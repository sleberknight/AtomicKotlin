package properties3

class Counter {
    var value = 0

    private val amount = 10

    fun inc() {
        value += amount
    }

    fun dec() {
        value -= amount
    }
}