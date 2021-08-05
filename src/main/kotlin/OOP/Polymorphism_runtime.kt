package OOP

fun main(args: Array<String>){
    var a = Sup()
    a.method1()
    a.method2()
    var b = Sum()
    b.method1()
    b.method2()
}
open class Sup{
    open fun method1(){
        println("Printing method 1 from inside Sup")
    }
    fun method2(){
        println("Printing method 2 from inside Sup")
    }
}
class Sum : Sup(){
    override fun method1() {
        println("Printing method 1 from inside Sum")
    }
}