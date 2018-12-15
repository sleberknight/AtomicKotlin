package constrainingVisibility2

class Robot(private val gridSize: Int, private var x: Int, private var y: Int) {

    private fun remainOrTeleport(coordinate: Int): Int {
        val insideGrid = coordinate % gridSize
        return if (insideGrid >= 0) insideGrid else (gridSize + insideGrid)
    }

    fun goRight(steps: Int) {
        if (invalidSteps(steps)) return
        x += steps
        x = remainOrTeleport(x)
    }

    fun goLeft(steps: Int) {
        if (invalidSteps(steps)) return
        x -= steps
        x = remainOrTeleport(x)
    }

    fun goDown(steps: Int) {
        if (invalidSteps(steps)) return
        y += steps
        y = remainOrTeleport(y)
    }

    fun goUp(steps: Int) {
        if (invalidSteps(steps)) return
        y -= steps
        y = remainOrTeleport(y)
    }

    fun getLocation(): String = "($x,$y)"

    override fun toString(): String = "Robot(x=$x,y=$y)"

    private fun invalidSteps(steps: Int): Boolean {
        if (steps < 1) {
            println("Incorrect input: $steps, the number of steps should be positive.")
            return true
        }

        return false
    }
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    robot.goRight(-1)
}
*/
/* Output:
Incorrect input: -1, the number of steps should be positive.
*/