package chaper2

fun main() {

}

abstract class MyAbstract {
    fun myFun() { }
    abstract fun myFun2()
    abstract var name:String
}

class MyClass7:MyAbstract() {
    override fun myFun2() {

    }

    override var name: String
        get() = "hello world"
        set(value) {}

}