package chapter3

annotation class TestAnnotation(val count:Int)
class MyTestClass {
    @TestAnnotation(3)
    val myVal:String = "hello"

    @TestAnnotation(5)
    fun myFun() {

    }
}

fun main() {
    val methods = MyTestClass::class.java.methods
    for(method in methods) {
        if(method.isAnnotationPresent(TestAnnotation::class.java))
            println("${method.name}")
            var annotation = method.getAnnotation(TestAnnotation::class.java)
            println(annotation.count)

    }
}