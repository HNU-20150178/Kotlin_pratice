fun main(args: Array<String>){
    try {
        val str = "123"
        print(str.toLong() + 2)
    }catch(e: NumberFormatException){ // 문자열이 long형 숫자로 변환 될 수 없을 경우
         print(e)
    }
}
