package chapter3

fun main() {
    hoFun(10, {x->x*100})
    hoFun(10) { x->x*100}
    hoFun(10) {it*100}

    hoFun2({x->x*10})
    hoFun2 { x->x*10}
    hoFun2 {it*10}
}

fun normalFun(a:Int, b:Int):Int {
    return a+b
}

fun hoFun(a:Int, b:(Int)->Int):Int {
    val res = b(10)
    println("a: $a, res: $res")
    return res
}

fun hoFun2(b:(Int)->Int):Int {
    val res = b(10)
    println("res: $res")
    return res
}
