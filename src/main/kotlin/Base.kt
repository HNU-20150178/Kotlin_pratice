import kotlin.jvm.JvmStatic

internal open class Base {
    open fun test() {
        println("Base ")
    }
}

internal open class DerivedA : Base() {
    override fun test() {
        println("DerivedA ")
    }
}

internal class DerivedB : DerivedA() {
    override fun test() {
        println("DerivedB ")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val b1: Base = DerivedB()
            val b2: Base = DerivedA()
            val b3: Base = DerivedB()
            b1.test()
            b2.test()
            b3.test()
            /*b1=(Base)b3;
		Base b4=(DerivedA)b3;
		b1.test();
		b4.test();
		*/
        }
    }
}