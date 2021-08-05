package OOP
//제네틱타입 예제
fun main(args: Array<String>){
    val intger: GenCl<Int> = GenCl<Int>(10)
    println(intger.a)
    val flgen = GenCl(1.0)
    println(flgen.a)
    println("---------")
    fun <T> addTwo(a: List<T>){
        for(x in a){
            println(x)
        }
    }
    addTwo(listOf(10, 20, 30, 40))
    addTwo(listOf('a', 'b', "c", "d"))
}
class GenCl<T>(t: T) {
    var a = t
}
/*
Number을 활용해 제한가능
class GenCl<T: Number>(t: T) {
    var a = t
}
 */
