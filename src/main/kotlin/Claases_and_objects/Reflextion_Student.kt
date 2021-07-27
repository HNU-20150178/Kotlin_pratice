package Claases_and_objects

import kotlin.reflect.full.memberProperties
/*
class reflextion_Student {
    constructor(roll_number: Int, full_name:String)
}
*/
class Reflextion_Student constructor(var roll_number: Int, var full_name:String)



fun main(args: Array<String>){
    var student1 = Reflextion_Student(20150178,"윤홍철")
    for(property in Reflextion_Student :: class.memberProperties){
        println("${property.name}=${property.get(student1)}")

    }
}