package OOP.interfaceEX

interface A{
    fun foo(){
        println("foo from A")
    }
}
//밑의 클래스는 여러 인터페이스의 동작을 가져다가 사용할 수 있다.
class IntefaceImplementation2: A, B

interface B{
    fun bar(){
        println("bar from B")
    }
}
interface C{
    fun bar(){
        println("bar from C")
    }
}
//class IntefaceImplementation3: B,C //이대로라면 컴파일오류
class IntefaceImplementation3: B,C{
    override fun bar() {
        super<C>.bar()
        super<B>.bar()
        super<C>.bar()
    }
}
fun main(args: Array<String>){
    var interfaceImplementation = IntefaceImplementation3()
    interfaceImplementation.bar()
}


