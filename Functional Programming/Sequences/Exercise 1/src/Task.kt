package sequences1

fun School.getCommonLessons(
        instructor: Instructor,
        student: Student
): Sequence<Lesson> {
    return lessons
            .filter { it.instructor == instructor }
            .filter { it.students.contains(student) }
}