package properties2

class Robot {

    private val gridSize = 100

    var x = 0
    var y = 0

    private fun remainOrTeleport(coordinate: Int): Int {
        val insideGrid = coordinate % gridSize
        return if (insideGrid >= 0) insideGrid else (gridSize + insideGrid)
    }

    fun goRight(steps: Int) {
        x += steps
        x = remainOrTeleport(x)
    }

    fun goLeft(steps: Int) {
        x -= steps
        x = remainOrTeleport(x)
    }

    fun goDown(steps: Int) {
        y += steps
        y = remainOrTeleport(y)
    }

    fun goUp(steps: Int) {
        y -= steps
        y = remainOrTeleport(y)
    }

    fun getLocation(): String = "($x,$y)"

    override fun toString(): String = getLocation()
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.goUp(1)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
/* Output:
(0,0)
(0,99)
(90,99)
*/