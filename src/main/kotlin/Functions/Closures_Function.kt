package Functions

fun main(args: Array<String>){
    //https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/Functions#%ed%81%b4%eb%a1%9c%ec%a0%80
    var sum = 0
    var listOfInteger = arrayOf(0,1,2,3,4,5,6,7)
    listOfInteger.forEach {
        sum+=it
    }
    println("sum")
}