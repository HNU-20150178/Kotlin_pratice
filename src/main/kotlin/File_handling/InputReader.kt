package File_handling
import java.io.File
import java.io.InputStream

fun main(args: Array<String>){
    val inputStream: InputStream = File("C:/Users/yhc96/OneDrive/문서/lorem.txt").inputStream()
    val inputString = inputStream.reader().use { it.readText() } // 모든 줄을 읽어서 출력하는 방법
    println(inputString)
}
