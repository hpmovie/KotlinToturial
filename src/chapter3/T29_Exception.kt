package chapter3

import java.lang.Exception

fun main() {
    val result = myFun("test")
    println(result)
}

fun myFun(myVal:String):Int {
    val result:Int =  try {
        println(myVal)
        myVal.toInt()
    } catch (e:Exception) {
        e.printStackTrace()
        println("{$e}")
        0
    } finally {
        println("hello finally")
    }

    return result

}