package Claases_and_objects

import logger

class Student(var roll_number:Int, var name:String) {
}
// 클래스의 기본값을 부여하는 방법
class Student2(var roll_number:Int, var name: String="kathus"){}
class Student3(val name: String){
    constructor(name: String, lastName: String) : this(name){

    }
}
class Student4(var roll_number: Int, var name: String){
    init{
        //logger().info("Student initialized")
    }
}


fun main(args: Array<String>){
    var student_A = Student(1,"Katarina")
    var student_B = Student2(2)
    println("Rollnumber: ${student_A.roll_number} Name : ${student_A.name}")
    println("Rollnumber: ${student_B.roll_number} Name : ${student_B.name}")

}