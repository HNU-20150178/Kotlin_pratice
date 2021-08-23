package Collection_FrameWork

fun main(args: Array<String>){
    val p1 = Person(91)
    val p2 = Person(10)
    val p3 = Person(40)
    val listOfPerson = listOf<Person>(p1,p2,p3)
    var sortedListOfPerson = listOfPerson.sortedBy {
        it.age
    }
    for(i in listOfPerson){
        print("${i.age}, ")
    }
    println()
    for(i in sortedListOfPerson.indices){
        print("${sortedListOfPerson[i].age} ,")
    }


}
class Person(var age:Int)