package Functions

import java.util.*
import kotlin.reflect.full.memberProperties

fun main(args: Array<String>){
    foo()
    foo(1)
    foo(1,0.1)
    foo(1,0.1,"custom string")
    println("-------------------------------------")
    //Event("Celebration")
    //Event("Celebration",Date())
    //Event("Celebration",Date(),true)

}
//Java 호출자에게 여러개의 오버로딩된 함수를 노출하기위해
//자바코드에서 호출될지라도 우리의 생성자나 함수가 기본값을 가지게 할 수 있다.
@JvmOverloads fun foo(a:Int=0, b:Double=0.0, c:String="some default value"){
    print("a = ${a}, ")
    print("b = ${b}, ")
    println("c = ${c}")
}
/*
fun foo(a:Int=0, b:Double=0.0, c:String="some default value"){
    print("a = ${a}, ")
    print("b = ${b}, ")
    println("c = ${c}")
 */

//data class Event @JvmOverloads (var eventName: String? = "", var eventScedule:
//              Date? = Date(), var isPrivate: Boolean = false)
