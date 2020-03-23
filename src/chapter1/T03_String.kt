package chapter1

fun main() {
    val str1:Char = 'c'
    val str2:String = "C"
    val str3 = """A modern programming language
that makes developers happier.
Open source forever""".trimMargin()
    val str4 = "hello \n world"

    val myVal=10
    println("hello "+myVal)
    println("hello $myVal")
    println("hello ${myVal+20}") // 문자열 템플릿
    println("hello ${sum(myVal, 20)}")

    getLength("hello world")
    getLength(100)
}

/**
 * String 입력시 문자열 길이 리턴, 그외에는 0 리턴
 */
fun getLength(myVal:Any):Int {
    if(myVal is String) {       // instanceof, is 사용시 smart cast
        return myVal.length;    // smart cast
    }
    return 0;
}