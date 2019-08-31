package sequences2

fun School.getStudentInstructors(
        student: Student
): Set<Instructor> {
    return lessons.filter { student in it.students }
            .map(Lesson::instructor)
            .toSet()
}

fun School.getStudentsOf(
        instructor: Instructor
): Set<Student> {
    return lessons.filter { it.instructor == instructor }
            .map(Lesson::students)
            .flatten()
            .toSet()
}