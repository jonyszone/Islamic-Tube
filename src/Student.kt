class Student (val firstName: String = "Shafi",
               val lastName: String="Jony") {

    var studentName: String? = null
    set(value) {
        field = value
        println("We set the value from setter $value")
    }

//    get() {
//        println("Returned value is $field")
//        return field
//    }


    fun printStudentName(){
        studentName = "Ul Islam"
        val  nickName = studentName ?: "empty value entred"
        println("$firstName $nickName $lastName")
    }

}