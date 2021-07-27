package StringParsing

fun main(agrs: Array<String>){
    val a= 5
    val b= 6
    val myString = """.
        .${if (a > b) a else b}
    """.trimIndent()
    println("Bigger number is ${myString.trimMargin(".")}")
}