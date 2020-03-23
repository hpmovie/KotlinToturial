package chapter3

fun main() {
    val res = sum(10, 20)
    val res1 = sum0(100, 200)
    val res2 = sum1(20,30)

    println("$res $res1 $res2")

}

fun sum(a:Int, b:Int):Int {
    return a+b
}

fun temp():Int {
    return 10+20
}

val sum0 = ::sum
val sum1 = { a:Int, b:Int ->
    println("my lambda $a $b")
    a+b
}

val sum2 = { a:Int, b:Int -> a+b}
val tempFun = {10+20}   // 파라미터 생략 가능
val tempFun2 = { println("hello world") }