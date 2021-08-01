package Functions.StaticFunction

import Functions.StaticFunction.*

fun main(args: Array<String>){
    foo() // import + 클래스외부에 선언
    Foo.callFoo() // object(Singleton method)
    SampleClass.foo() //클래스내에 companion 사용
    //자바코드에서 companion object안의 메소드 호출은 SampleClass.Companion.foo()
    //JvmStatic사용시 메소드 호출은 SampleClass.foo()로 가능하다.
}