package Claases_and_objects

class Dog : Mammal() {
    init{
        println("Hey from Dog")
    }
    override fun move(direction : String){
        println(direction)
    }
}

fun main(args: Array<String>){
    var x = Dog()
    x.move("North")
    println(x.show(123))
}
