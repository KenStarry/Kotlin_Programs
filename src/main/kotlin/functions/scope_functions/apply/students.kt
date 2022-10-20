package functions.scope_functions.apply

//  Our data class
data class Student(

    val name: String, val studentId: String, val course: String, val school: String

) {}

fun main() {

    //  Scope function way
    val students = ArrayList<Student>().apply {

        add(Student("Kent", "stud333", "Computer Science", "MMUST"))
        add(Student("Felishia", "stud444", "Clinical Medicine", "JKUAT"))
        add(Student("Clark", "stud555", "Engineering", "UoN"))
        add(Student("Ken", "stud789", "Biochemistry", "MMUST"))
    }

    //  Old way
    students.add(
        Student("John", "stud123", "Computer Science", "MMUST")
    )
    students.add(
        Student("Mary", "stud124", "Clinical Medicine", "JKUAT")
    )
    students.add(
        Student("Tracy", "stud125", "Engineering", "UoN")
    )
    students.add(
        Student("Caroline", "stud126", "Biochemistry", "MMUST")
    )
}