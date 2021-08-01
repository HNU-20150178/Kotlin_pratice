package Functions

fun main(args: Array<String>){
    var str1= "The start of a "
    var addStr = fun String.(Successor: String): String{
        return this + Successor
    }

    str1 = str1.addStr("beautiful day.")
    println(str1)
}