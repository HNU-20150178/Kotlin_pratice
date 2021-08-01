package Functions

//기본적으로 익명함수는 이름이 없는 일반 함수처럼 ㅅ너언할 수 있고, 표현식 또는 코드 블록이 될 수 있다.
//표현식이 될 수도 있고 코드블록이 될 수도 있다. 람다식과 달리 익명함수의 경우 매개변수가 항상 괄호 안에 전달된다.
fun main(args: Array<String>){
    performMath2(3,4,fun(a: Int, b: Int): Int = a * b)
    performMath2(3,4,fun(a: Int, b: Int): Int = a + b)

}
fun performMath2(a: Int, b: Int, mathFunc : (Int, Int) -> Int) : Unit{
    println("Value of calculation : ${mathFunc(a,b)}")
}