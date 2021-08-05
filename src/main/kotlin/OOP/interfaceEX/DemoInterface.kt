package OOP.interfaceEX

interface DemoInterface{
    fun implementatedMethod(){
        //JAVA8 이전엔 인터페이스에서 메소드 구현부 구현못했다.
        println("From demo interface")
    }
}
class IntefaceImplementation: DemoInterface {
}
fun main(args: Array<String>){
    var interfaceImplementation = IntefaceImplementation()
    interfaceImplementation.implementatedMethod()
}
