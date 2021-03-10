package com.erikaosgue.course2masterclass

fun main(args: Array<String>) {


    /********** Maps Immutable *********/

    var myEmptyMap = mapOf<String, Int>()


    /********** Maps Mutable *********/

    var myEmptyHashMap = hashMapOf<String, Int>() //Empty
    var myHashMap= hashMapOf(Pair("a", 1), Pair("b",  2))
    myHashMap.size
    myHashMap.put("c", 3)


    var myMap = mapOf(Pair("k", 10),Pair("l", 11))
    myHashMap.putAll(myMap)
    // myHashMap.replace("l", 111)
    myHashMap.remove("k")
    myHashMap.clear()

    myHashMap.containsValue(1)
    myHashMap.containsKey("k")
    myHashMap.isEmpty()
    myHashMap.isNotEmpty()


}