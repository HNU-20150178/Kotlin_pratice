package Functions

fun main(args : Array<String>){
    val productPrice1 = 600; //499이상 주문은 무료배송
    val productPrice2 = 300; //무료배송조건에 부합하지 않음
    val totalCost1 =totalCost(productPrice1);
    val totalCost2 =totalCost(productPrice2);
    println("Total cost for item 1 is ${totalCost1(productPrice1)}")
    println("Total cost for item 2 is ${totalCost2(productPrice2)}")

}
fun totalCost(productPrice:Int): (Int)-> Int {
    if(productPrice > 499){
        return { x-> x }
    }else{
        return { x -> x + 50}
    }
}