package File_handling

import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    var inputStream: InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    var inputString = inputStream.bufferedReader().use {
        it.readText()
    }
    println(inputString)

}