package Claases_and_objects

import java.util.*
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

open class Reflextion_Person(var Id: String, var Roll_number:Int) {
    val isHuman:Boolean=true
    val isDog:Boolean=false
}


class Person(Id:String,Roll_number: Int): Reflextion_Person(Id,Roll_number){


}

fun main(args: Array<String>){
    var kim = Person("GwangHyun",12)
    var i :Int = 0
    //for(property in Person::class.declaredMemberProperties){
    for(property in Person::class.memberProperties){
        i++
        println("${i}.${property.name}=${property.get(kim)}")
    }
}