package chaper2

fun main() {
    val rect = MyRect()
    rect.myPaint()

    val shape:MyShape = rect

    val rect2:MyRect = shape as MyRect
}

open class MyShape {
    var x:Int = 0
    open var y:Int = 0
    open fun myPaint() {
        println("location is $x $y")
    }
}

class MyRect:MyShape() {    // ()<-- 생성자를 호출한다는 의미
    override var y = 200
    override fun myPaint() {
        println("rect location is $x $y")
    }
}