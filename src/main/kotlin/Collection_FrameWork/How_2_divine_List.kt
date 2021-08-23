package Collection_FrameWork
//for 루프나 while 루프를 사용하지 않고 리스트르 나누고 싶을떄
fun main(args: Array<String>){
    val listA = listOf(1,2,3,4,5,6)
    //파티션 함수: 원본 배열을 조건이 참이 되는 아이템들을 가진 첫 번째 리스트와 조건이 거짓인 아이템들을 가진 두번쨰 리스트 한쌍으로 분리한다
    val pair = listA.partition {
        it%2 == 0
    } // 파티션 함수가 반환하는 객채는 2개의 서브리스트를 보관, 유지하는 Pair 객체이다.
    println(pair)

    //Set도 동일하게 동작한다
    val setA = setOf(1,2,3,4,5,6)
    val pair_set = setA.partition {
        it%2 == 0
    }
    println(pair_set)
}