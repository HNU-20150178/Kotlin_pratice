package Claases_and_objects

abstract class Mammal {
    init{
        println("Hey from Mammal")
    }
    abstract fun move(Direction: String)
    fun show(y: Int) : String{
        return y.toString()
    }
}