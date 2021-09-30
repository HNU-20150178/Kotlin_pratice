package File_handling
import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    val listOfLines = mutableListOf<String>()
    val inputStream: InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    inputStream.reader().useLines { lines ->
        lines.forEach {
            listOfLines.add(it)
        }
    }
    listOfLines.forEach{ println("$ " + it) }
}
