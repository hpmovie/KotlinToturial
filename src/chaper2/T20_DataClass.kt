package chaper2

fun main() {
    val u1 = MyUser5("kotlin", 10)
    val u2 = MyUser5("kotlin", 10)
    println(u1.equals(u2))
    println(u1.toString())
    println(u1.component1())
    val u3 = u1.copy(age=11)
    println(u3.toString())
}


data class MyUser5(val name:String, val age:Int)