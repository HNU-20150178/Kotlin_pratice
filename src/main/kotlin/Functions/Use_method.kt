package Functions

import java.io.FileInputStream

/*
private static void printFile() throws IOException {
    InputStream input =null;
    try{
        input = new FileInputStream("samplefile.txt");
        //input 객체를 이용한 작업
        } finally {
            if(input != null){
                input.close
                //리소스 닫기
            }
        }
}
위와같은 형태가 JAVA에서의 리소스 관리다.
java7의 경우는
try(FileInputStream input = new FileInputStream("file.txt"){
    int data = input.read();
}
 */
//Kotlin의 경우
fun main(args: Array<String>){
    FileInputStream("file.txt").use{
        input-> var data = input.read()

    }
}
