package com.erikaosgue.helloandroidstudio



fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,6,8,9)
    println(reverse(numbers))
    println(reverse2(numbers))
    println(reverse3(numbers))
}

// # functions that get diferently the indexes of a list

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in list.indices){
        result.add(list[list.size-1-i])
    }
    return result
}


fun reverse2(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in 0..list.size-1) {
       result.add(list.get(list.size - 1 - i))
    }
    return result
}


fun reverse3(list: List<Int>): List<Int> {
   val result = arrayListOf<Int>()
    for (i in list.size-1 downTo 0) {
        result.add(list[i])
    }
    return result
}