package Claases_and_objects

import kotlin.reflect.KClass

class Get_Class_From_Reflextion_Class {
    val myVal : KClass<Mammal> = Mammal::class
    val a : Class<Mammal> = Mammal::class.java
}
fun main(args: Array<String>){
    var A = Get_Class_From_Reflextion_Class()
    println("isAbstract : ${A.myVal.isAbstract}")


}