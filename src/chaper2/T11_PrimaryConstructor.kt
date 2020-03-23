package chaper2

/**
 * primary constructor
 */
class MyClass2 { }
class MyClass3() { }
class MyClass4 constructor() { }
class MyClass5(private val name:String) {
    fun sayHello( ) {
       println("hello $name")
    }
}


class MyClass6 constructor(name:String, age:Int=0) {
    private val myName = name
    init {  //생성자에서 호출 primary constructor(주생성자) 데이터 초기화
        println(name)
    }

    fun sayHello() {
        println("hello $myName")
    }
//    fun sayHello() {
//        println("hello $name");     // name은 멤버변수가 아니고 생성자 매개변수임. 사용불가
//    }
}
// java
//class MyClass6 {
//    MyClass6(String name) {
//        println(name)
//    }
//}

fun main() {
    val myVal2 = MyClass2()
    val myVal3 = MyClass3()
    val myVal4 = MyClass4()
}

