


open class StudentInformation : StudentInfoProvider, SessionInfoProvider {
    override val studentInfo: String
        get() = "Student's Basic Info"

    override fun getSessionID(): String {
        return "Session"
    }
//    override fun printStudentName(student: Student) {
//        println("Student Information")
//        student.printStudentName()
//    }



}

