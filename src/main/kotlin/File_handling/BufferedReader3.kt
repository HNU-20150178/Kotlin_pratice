package File_handling

import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    var inputStream: InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    var inputString = inputStream.bufferedReader(Charsets.ISO_8859_1).use {
        it.readText()
    }
    println(inputString)
}


