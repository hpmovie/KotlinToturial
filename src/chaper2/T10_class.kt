package chaper2

fun main() {
    val myObj = MyClass();
    myObj.myFun()
}

class MyClass{
    val myVariable = 10
    fun myFun() {
        println("hello class")
    }
}