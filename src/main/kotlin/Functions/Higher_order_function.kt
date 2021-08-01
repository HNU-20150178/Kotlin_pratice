package Functions

fun main(args: Array<String>){
    val funcMultiply : (Int,Int)->Int = {a:Int, b:Int -> a*b}
    val funcSum: (Int,Int)->Int = {a:Int, b:Int -> a+b}
    performMath(3,5,funcMultiply)
    performMath(3,5,funcSum)
}
fun performMath(a:Int, b:Int, mathFunc : (Int,Int)->Int) : Unit{
    println("Value of calculation : ${mathFunc(a,b)}")
}