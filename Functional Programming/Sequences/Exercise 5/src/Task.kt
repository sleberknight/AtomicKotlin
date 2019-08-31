package sequences5

fun School.findInstructorsWithLargestClass(): Set<Instructor> {
    val maxClassSize = lessons.map { it.students.size }.max() ?: 0

    return lessons
            .filter { it.students.size == maxClassSize }
            .map(Lesson::instructor)
            .toSet()
}