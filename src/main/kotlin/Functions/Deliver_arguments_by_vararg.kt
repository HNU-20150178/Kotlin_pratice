package Functions

fun main(args: Array<String>){
    someMethod("as","you","know","this","works")
    var list = arrayOf("as","you","know","this","works")
    someMethod(*list) //반면 *(스프레드 연산자는 래핑된 배열을 풀어 별도의 인수로 전달하도록 지시한다.
    someMethod2(3,*list)
    refactoring_someMethod2("Refactoring","as","you","know","this","works") //이것과 같이 vararg는 마지막 인수로서 전달된다.
    //vararg뒤에 인수를 받고싶으면 명명이 필요하다.
    refactoring_someMethod2_addC("refactoring","as","you","know","this","works",c = "CCCCCCCC")
    default_value_someMethod2("3","as","you","know","this","works") //b는 3이나옴
    default_value_someMethod2(a=*arrayOf("3","as","you","know","this","works")) //이렇게 작성시 b는 default값 출력
}
fun someMethod(vararg a: String){
    //vararg는 수정자를 사용해 변수인수를 함수에 전달 할 수 있다.
    //vararg는 컴파일러에게 전달받은 인수들을 배열로 래핑하도록 한다. to 6Line
    for(a_ in a){
        println(a_)
    }
}
fun someMethod2(b:Int, vararg a: String){
    for(a_ in a){
        println(a_)
    }
}
fun refactoring_someMethod2(b:String, vararg a: String){
    print("b:${b}")
    for(a_ in a){
        println(a_)
    }
}
fun refactoring_someMethod2_addC(b:String, vararg a: String, c:String){
    print("b:${b}")
    for(a_ in a){
        println(a_)
    }
    println("c: ${c}")
}
fun default_value_someMethod2(b: String="x",vararg a: String){
    println("b:${b}")
    for(a_ in a){
        println(a_)
    }
}


