package File_handling

import java.io.File

fun main(args: Array<String>){
    val inputString = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").reader().use {
        it.readText()
    }
    println(inputString)
}