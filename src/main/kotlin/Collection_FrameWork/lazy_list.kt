package Collection_FrameWork

fun main(args: Array<String>){
    //asSequence를통해 시퀀스로 변환한다. 그럴경우 B 리스트는 처음 접근될 때 만들어질 것이다.
    //val A = listOf(1,2,3,4)
    val A = listOf(1,2,3,4).asSequence()

    var B = A.filter {
        println("checking ${it}")
        it%2==0
    }
    //sequence와 함께 활성화,비활성화해보시오
    B.forEach{
        println("printing $it")
    }
    //시퀀스는 제한이 없으며 미리 목록의 길이를 알수 없는 경우에 사용된다. == 자바의 stream
    //무한할 수 있기 때문에 이러한 유형의 구조에는 lazy evaluated가 필요하다.

    val seq = generateSequence(1){it*2} //generateSequence로 무한한수열만듬
    seq.take(10).forEach {
        print(" $it ")
    }
    //take 1-으로 인해 10개의 항목만 계산되고 출력한다.
}