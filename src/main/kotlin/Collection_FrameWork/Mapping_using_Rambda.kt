package Collection_FrameWork

fun main(args: Array<String>){
    val listOfNumbers = listOf(1,2,3,4,5,6,7,8,9)
    var evenList = listOfNumbers.filter {
        it%2==0
    }
    var transformedList = listOfNumbers.map{
        it*2
    }
    val listOfNumbers2 = listOf(1,2,3,4,5)
    val map = listOfNumbers2.mapIndexed { index, it -> it * index }

    println(evenList)
    println(transformedList)
    println(map)
}