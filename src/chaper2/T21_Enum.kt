package chaper2

fun main() {
    val dir = Direction.NORTH
    println("${dir.name} ${dir.ordinal}")
    println("${dir.no} ${dir.str}")

    val dir2 = Direction2.NORTH
    dir2.myFun()
}

enum class Direction2 {
    NORTH {
        override val data1:Int = 0
        override fun myFun() {

        }
    },
    SOUTH {
        override val data1:Int = 10
        override fun myFun() {}
    };

    abstract val data1:Int
    abstract fun myFun()
}

enum class Direction(val no:Int, val str:String) {
    NORTH(11, "hello"), SOUTH(12, "world"), WEST(13, "kotlin"), EAST(14, "android")
}