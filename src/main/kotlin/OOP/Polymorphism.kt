package OOP
fun main(args: Array<String>){
    println(doubleOf(1))
    println(doubleOf(4.3))
    println(doubleOf(4.323))
}

fun doubleOf(a: Int): Int{
    print(1);
    return 2 * a
}
fun doubleOf(a: Float): Float{
    print(1);
    return 2 * a
}
fun doubleOf(a: Double): Double{
    print(1);
    return 2.00 * a
}

