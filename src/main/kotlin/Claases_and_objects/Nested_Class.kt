package Claases_and_objects

class Nested_Class {

}
fun main(args: Array<String>){
    var a = outCl()
    a.printAB()
    a.inCl().printB()
}

class outCl {
    var a = 6
    fun printAB(){
        var b_ = inCl().b
        println("a = ${a} and b = ${b_} from inside outCl")
    }
    inner class inCl{
        var b = "9"
        fun printB(){
            println("a = $a and b = $b from inside inCl")
        }
    }
}