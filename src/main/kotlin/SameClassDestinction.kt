import packageA.SameClass as anotherSameClass
import packageB.SameClass
fun main(args: Array<String>){
    anotherSameClass.methodA();
    SameClass.methodB();
}
