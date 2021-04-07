interface StudentInfoProvider {

    val studentInfo: String


    fun printStudentName(student: Student){
        println(studentInfo)
        student.printStudentName()
    }

}

