package OOP.interfaceEX

import Functions.StaticFunction.foo

fun main(args: Array<String>){
    //요청을 두번째 객체에 위임하여 처리
    var interfaceImplementation = Mendate(object: MendateInterface{})
    interfaceImplementation.someMethod()

    println("--------------------------------")
    var mendate_2 = Mendate2(object: K{})
    mendate_2.someMethod()



}
class Mendate(var m: MendateInterface){
    fun someMethod(){
        m.foo()
    }
}
interface MendateInterface{
    fun foo(){
        println("foo from MendateInterface")
    }
}




//밑의 클래스는 K인터페이스를 구현하고 있지만 매개변수로 받는 객체에 구현을 위임한다.
class Mendate2(var k: K) : K by k{
    fun someMethod(){
        foo()
    }
}
interface K{
    fun foo(){
        println("foo from K")
    }
}