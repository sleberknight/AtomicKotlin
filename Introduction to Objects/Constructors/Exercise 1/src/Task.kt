package constructors1

class Robot(private val gridSize : Int, var x : Int, var y: Int) {

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
    val robot = Robot(10, 1, 1)
    println(robot.getLocation())
    robot.goUp(2)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
/* Output:
(1,1)
(1,9)
(1,9)
*/