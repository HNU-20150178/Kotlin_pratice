package StringParsing
fun main(args: Array<String>){
    val str = "11111111"
    println(str.toLongOrNull(2))
    val str8 = "377"
    println(str8.toLongOrNull(8))
    val str10 = "255"
    println(str10.toLongOrNull(10))
}
