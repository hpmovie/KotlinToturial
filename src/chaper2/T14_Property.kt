package chaper2

fun main() {
    val user = MyUser3()
    println(user.name)
}

class MyUser3 {
    val temp:Int
        get() { return 10 }

    var name:String = "hello"
        get() { return field.toUpperCase() }
        set(value) { field = "this is "+value }

    var age:Int = 20
        set(value) {
            field = if(value>20) value else 0
        }
}