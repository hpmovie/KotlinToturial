package chapter1

fun main() {
    val a = 200
    when(a) {
        100 -> println("value is 100")
        200 -> { println("value is 200")}
        else -> { println("value is not 100 or 200")}
    }

    val b = "hello"
    when(b) {
        "hello" -> println("value is hello")
        "world" -> println("value is world")
    }
    when(a) {
        10, 20, 30 -> {}
        in 100..1000 -> {}
    }

    val res = when(a) {
        1 -> "value is 1"
        else -> {
            println("hello world")
            "value is not 1"
        }
    }

    println(res)
}