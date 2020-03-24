package chapter3

fun main() {
    val user:MyUser2? = MyUser2()

    val city1 = if(user != null) {
        if(user.address != null) {
            user.address.city
        } else {
            null
        }
    } else {
        null
    }

    val city2 = user?.address?.city // null이면 null리턴, null이 아니면 뒷 구분 실행
    println(city2)
    val city3 = user!!.address!!.city   // null이면 익셉션 발생
    println(city3)

    val temp:Int? = 10
    val temp2:Int = temp ?:0    // null이면 뒷부분(0), 아니면 temp
    println(temp)

    val str:String? = "kotlin"
    val myInt = str as? Int     // 안전한 캐스팅
    println(myInt)
}

class MyAddress {
    val city:String? = "seoul"
}

class MyUser2 {
    val address:MyAddress? = MyAddress()

}