package com.erikaosgue.course2masterclass.standardFunctions

/**
 *
 * Exercise: takeIf and takeUnless
Have the user introduce 10 numbers.

Print a list that contains only odd numbers and make sure to exclude the numbers 3 and 13.


 */

fun main() {

    val listNumbers = arrayListOf<Int>()
    println("Enter ten numbers")
    for (i in 1..10) {
        var input = readLine()?:""
        var number = input.toInt()


        number.takeIf { it % 2 != 0 }
                .takeUnless { it == 3 || it == 13 }
                ?.let {listNumbers.add(it)}

    }
    println(listNumbers)

}