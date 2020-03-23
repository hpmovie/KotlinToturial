package chaper2

fun main() {
    val myUser = MyUser2("Hello", 11, "abc@abc.com")
}

class MyUser2(name:String) {
    init {
        println("init block $name")
    }

    constructor(name:String, age:Int) : this(name) {
        println("secondary constructor $name, $age")
    }
    constructor(name:String, age:Int, email:String) : this(name, age) {
        println("secondary constructor $name, $age, $email")
    }
}