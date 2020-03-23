package chapter1

fun main() {
    val a1 = 100;
    val a2 = 200;
    sum(a1, a2)
    val res = sum(10)
    println(res)
}

fun sum(a:Int, b:Int=100):Int {
    var sumVal = 0
    fun calSum() {
        sumVal = a+b
    }

    calSum()

    return sumVal
}

fun sum2(a:Int, b:Int) = a+b

fun tempfun(a:Int, b:Int) {

}