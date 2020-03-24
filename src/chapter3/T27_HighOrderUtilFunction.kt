package chapter3

fun main() {
    val user = MyUser()
    user.name="kotlin"
    user.age = 11
    user.sayHello()

    val user2 = MyUser()
    val result = user2.run { // 바로 객체의 멤버에 접근 가능
        name ="hello"
        age = 12
        sayHello()
        "abc"
    }
    println(result)

    val user3 = MyUser()
    val result2 = user3.apply {
        name="world"
        age=13
        sayHello()
    }
    println(result2)

    user2.let {
        it.name ="android"
    }

    with(user2) {
        name = "oracle"
        age = 14
    }
}

class MyUser {
    var name:String? = null
    var age:Int? = null
    fun sayHello() {
        println("I am $name, $age years old.")
    }
}