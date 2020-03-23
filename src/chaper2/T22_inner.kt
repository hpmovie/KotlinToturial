package chaper2

fun main() {
    val obj = MyOuter.MyNested()
    obj.myFun()

    val obj2 = MyOuter()
    obj2.hello()

    val obj3 = obj2.MyInner()
    obj3.myFun()

}

class MyOuter {
    var no = 10
    var temp = MyInner()
    fun hello() {
        temp.myFun()
    }

    inner class MyInner{
        val name = "hello"
        fun myFun() {
            println("inner class $name $no")
        }
    }

    class MyNested {
        val name = "world"
        fun myFun() {
            println("nested class $name")   // $no 접근 불가능
        }
    }
}