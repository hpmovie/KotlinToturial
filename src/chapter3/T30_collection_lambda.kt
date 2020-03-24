package chapter3

fun main() {
    val res = listOf(1,2,3)
        .map {it*10}
        .filter {it>10}


    listOf(1,4,2)
        .sortedBy { it%2 }
        .forEach{ println(it) }

    println(res)
}