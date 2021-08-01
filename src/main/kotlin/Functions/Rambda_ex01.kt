package Functions

//고차함수에서는 함수를 매개변수로 전달하고 반환받을 수 있다. 이것은 매우 유용한 기능이며 코드를 더욱 쉽게 작성할 수 있게 해준다.
//코틀린에서는 함수와 함수 레퍼런스를 값으로 선언하여 함수에 전달 할 수 있다.
fun main(args: Array<String>){
    //val funcMultiply = {a:Int, b:Int -> a*b}
    val funcMultiply : (Int,Int)->Int = {a:Int,b:Int -> a*b} // 인수 유형과 반환 유형을 명시적 표현
    println(funcMultiply(3,5))

    //val funcSayHi = {name: String -> println(Hi ${name})}
    val funcSayHi:(String) -> Unit = {name:String-> println("Hi, ${name}")} //Unit=null
    funcSayHi("Yoon")


}