package chapter1

fun main() {
    /**
     *  List iterator
     */
    val list1 = listOf("hello","world","kotlin","adnroid")
    val iterator = list1.iterator()
    while(iterator.hasNext()) {
        val res = iterator.next()
        println(res);
    }

    /**
     * map iterator
     */
    val myMap = mapOf<String, String>("one" to "hello", "two" to "world")
    val iteratorMap = myMap.iterator()
    while(iteratorMap.hasNext()) {
        val res = iteratorMap.next()
        println("${res.key}/${res.value}")
    }
}