package Collection_FrameWork

fun main(args: Array<String>){
    val listOfInt = listOf(1,2,3,4,5)
    val sortedList = listOfInt.sortedDescending()
    sortedList.forEach{
        print("$it ")
    }

    val p1 = Person(25)
    val p2 = Person(45)
    val p3 = Person(10)
    val listOfPerson = listOf<Person>(p1,p2,p3)
    val sortedListOfPerson = listOfPerson.sortedByDescending {
        it.age
    }
    println()
    sortedListOfPerson.forEach{
        print("${it.age} ")
    }


}