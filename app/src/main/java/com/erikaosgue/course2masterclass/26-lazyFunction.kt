package com.erikaosgue.course2masterclass

/***
 *
 * -------Exercise 1----------
 * Define a function that creates an array list with 1000 random integers
 * and assing the result to a variable
 *
 * Ask the user to input to the console whether the list should be
 * generated. If they enter 'yes', generate and print a list, otherwise
 * don't
 */
import kotlin.random.Random

fun main() {

    val someLargeVariable: String by lazy { "some large value" }

    if (Random.nextInt() % 2 == 0)
        println(someLargeVariable)

    // -------Exercise 1----------
    val list by lazy { listOfRandomNumbers() }
    println("Should the list be generated (yes/no)")

    val input = readLine() ?: ""
    when (input.toLowerCase()) {
        "yes" -> println ("Generating list ... \n${list}")
        "no" -> println("List not generated... BYE")
        else -> println("Invalid Keyword")
    }
}


// -------Exercise 1----------
fun listOfRandomNumbers(): List<Int> {
    val integers = arrayListOf<Int>()
    for (i in 1..1000) {
        integers.add(Random.nextInt(1000))
    }
    return integers
}