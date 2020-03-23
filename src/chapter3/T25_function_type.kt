package chapter3

fun main() {

}

fun myFunction(a:Int, b:Int):Boolean {
    return a>b
}

val c:Int = 0
val lambdaFun:(Int, Int)->Boolean = {a:Int, b:Int -> a>b }
val lambdaFun2:(Int)->Int = { x -> x*10 }
val lambdaFun3:(Int)->Int = { it * 10 }