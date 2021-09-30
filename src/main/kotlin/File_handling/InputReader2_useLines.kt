package File_handling
import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    val listOfLines2 = mutableListOf<String>()
    File("C:/Users/yhc96/OneDrive/문서/lorem.txt").reader().useLines { lines ->
        lines.forEach {
            listOfLines2.add(it)
        }
    }
    listOfLines2.forEach{ println("$ " + it) }
}
