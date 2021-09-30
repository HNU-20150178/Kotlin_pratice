package File_handling

import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    val listOfLines = mutableListOf<String>()
    val inputStream: InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    inputStream.bufferedReader().useLines { lines ->
        lines.forEach {
            var x = "# (" + it.length +")" + it.substring(0,3)
            listOfLines.add(x)
        }
    }
    listOfLines.forEach{ println(it) }
    inputStream.close() // useLines 사용시 close 스트림을 닫아준다.
}