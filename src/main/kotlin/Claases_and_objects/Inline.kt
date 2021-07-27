package Claases_and_objects

fun main(args: Array<String>){
    var a = Inline()
    a.valueIsMaxedOut = false
    println(a)

}
//메모리 오버헤드를 줄이기위해 사용
class Inline {
    companion object{
        val CONST_MAX = 3
    }
    var someValue = 3
    var valueIsMaxedOut: Boolean
        inline get() = someValue == CONST_MAX
        inline set(value){
            println("Value set!")
        }
    /*
    inline var valueIsMaxedOut: Boolean
        get() = value ==CONST_MAX
        set(value){
            println("Value set!")
        }

    하지만 속성에 backing field가 있거나 접근자가 backing field를 참조하는 경우
    인라인을 속성 또는 접근자에 적용할 수 없다

     */


}