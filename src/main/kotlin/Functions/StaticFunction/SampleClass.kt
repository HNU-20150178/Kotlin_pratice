package Functions.StaticFunction

class SampleClass {
    companion object{
        //클래스 이름을 사용하여 클래스의 요소에 접근할시 companion 키워드를 사용 할 수 있음
        fun foo()= println("In foo method")
        //자바코드 호출시 "SampleClass/Companion.foo"형태가 싫다면 JvmStatic사용
        @JvmStatic
        fun fooo() = println("In foo method by JvmStatic")
    }

}
fun foo(){
    println("calling from boo method")
}
object Foo{ // object = 싱글톤
    fun callFoo() = println("Foo")
    var foo = "foo"
}