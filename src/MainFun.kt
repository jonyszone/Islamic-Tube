fun checkTypes (infoProvider: StudentInfoProvider){
    if (infoProvider !is SessionInfoProvider)
        println("is not  instance of" )

    else
        println("is instance of ")
}




fun main() {
    println()

    val information = ExtraInformation ()
    information.printStudentName(Student())
    checkTypes(information)

    println()
}
