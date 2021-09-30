package File_handling

import java.io.File
import java.io.InputStream

//bufferedReader은 문자를 ㅇ릭어 버퍼에 저장한다.
fun main(args: Array<String>){
    val inputString = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").bufferedReader().use {
        it.readText()
    }
    println(inputString)
    val listOfLines = mutableListOf<String>()
    File("C:/Users/yhc96/OneDrive/문서/lorem.txt").bufferedReader().useLines { lines ->
        lines.forEach {
            var x = "> (" + it.length + ") "+ it;
            listOfLines.add(x)
        }
    }
    listOfLines.forEach{ println(it) }
    //stream을 가져와 사용하는 방법
    val listOfLines2 = mutableListOf<String>()
    val inputStream : InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    inputStream.bufferedReader().useLines { lines ->
        lines.forEach {
            var x = "> (" + it.length + ") " + it
            listOfLines2.add(x)
        }
    }
    println(listOfLines2)
}