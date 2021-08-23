package Collection_FrameWork

fun main(args: Array<String>){
    val listOfPersons=listOf(Person2(10),Person2(20),Person2(30),
        Person2(null))
    val sortedList=listOfPersons.sortedWith(compareBy(nullsLast<Int>(),{
        it.age }))
    sortedList.forEach{
        print(" ${it.age} ")
    }
}
class Person2(var age:Int?)

