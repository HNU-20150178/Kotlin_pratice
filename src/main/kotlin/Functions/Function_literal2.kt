package Functions

fun main(args: Array<String>){
    var str1= "The start of a "
    val addStr = fun String.(successor: String): Int{
        return this.length + successor.length
    }
    var x = str1.addStr("beautiful day.")
    print(x)

    fun testIfEqual(op: (String, String)-> Int,
                    a: String, b: String, c:Int) = assert(op(a,b)==c)

    testIfEqual(addStr, str1,"beautiful day.", str1.length + "beautiful day.".length)

}