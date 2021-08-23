package Collection_FrameWork

fun main(args: Array<String>){
    //코틀린의 listOf메소드는 불변 리스트이다. 리스트에 객체를 추가하려면 가변 리스트를 만들어야한다.
    var listA = mutableListOf<String>("a","a","b")
    var listB = mutableListOf<String>("a","c")
    listB.addAll(listA)
    val listC = listB.union(listA) // union은 병합된 컬렉션의 중복값을 제거한 고유값만 변환됨

    println(listB)
    println(listC)

    //Set은 집합
    var setA = mutableSetOf<String>("a","b","c")
    var setB = mutableSetOf<String>("a","c")
    setB.addAll(setA)
    println(setB)
    println(setB.union(setA))

    var mapA = mutableMapOf<String,Int>("a" to 1,"b" to 2)
    var mapB = mutableMapOf<String,Int>("a" to 2,"d" to 4)

    mapA.putAll(mapB)
    println(mapA)
    //키 a는 두 맵 모두에 정의되어 있지만, 나중에 나오는 맵의 값으로 결정된다

}