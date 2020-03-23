package chapter1

fun main() {
    for(i in 1..10) {
        println(i)
    }

    // for(int i=0 ; i<10 ; i++)
    for(i in 0 until 10) {
        println(i)
    }

    for(i in 10 downTo 1 step 2) {
        println(i)
    }

    val list = listOf("hello", "world", "kotlin", "android")
    for(str in list)
        println(str)
}