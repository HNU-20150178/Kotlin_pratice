package Functions

fun main(args: Array<String>){
    val sample = Sample()
    println(sample.isListBig)
    println()

    var s = SameClass()
    println(s.name)


}

class Sample{
    val array = mutableListOf<String>("Kenshi","Aimyong","Yuuri")
    var isListBig:Boolean = false // Array에 의존하는 다른속성인 IsListBig 선언
        get()=array.size>2 // get()을 이용해 게터를 수정가능하다.
    //val isListBig:Boolean get()=array.size>2 식도 가능
    /*
  세터 자바식
  public setIsListBig(boolean isListBig){
      this.isListBig=isListBig
  }
   */
        set(value){
            //반드시 재귀호출을 피하고 setter을 구현하려면 field 키워드가 필요하다
            field= array.size>2
        }
    /*의존성 주입을 사용한다면
    var mPresenter:MainActivityMvpPresenter?=null
    @Inject set
    */
}
class SameClass {
    var name= "aanand"
    get()=field.toUpperCase()
}