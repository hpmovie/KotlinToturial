package chapter1

fun main() {
    // Array
    var array1 = arrayOf(1,2,3, "hello world")
    var array2:Array<Int> = arrayOf<Int>(1,2,3)

//    array[2]        // 권장
//    array.get(2)    // 가능하긴 함

    // List
    val myList:List<String> = listOf("hello", "world")
    val myList2:MutableList<String> = mutableListOf("hello1");
    myList2.add("world1");
//    myList2[3]

    // set(인덱스 없음.중복된 내용을 허용하지 않음)
    var mySet = mutableSetOf<String>();
    mySet.add("hello")
    mySet.add("hello")
    println(mySet.elementAt(0))


    // Map
    val myMap = mutableMapOf<String, String>()
    myMap.put("one", "hello map")
    myMap["two"] = "hello kotlin"
    println(myMap.get("one"))
    println(myMap["two"])
}