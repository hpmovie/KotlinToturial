package chaper2

interface MyInterface {
    fun myFun1()
    var data1:String
}

interface MyInterface2 {
    fun myFun2()
}

class MyImpl : MyShape(), MyInterface, MyInterface2 {
    override fun myFun1() {

    }

    override var data1: String
        get() = "hello"
        set(value) {}

    override fun myFun2() {
    }

}