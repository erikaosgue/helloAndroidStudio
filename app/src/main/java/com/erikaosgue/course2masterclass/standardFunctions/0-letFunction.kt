package com.erikaosgue.course2masterclass.standardFunctions

/** CONTENT:
 * 1. Using let
 * 2. Personalize the it of let
 * 3. Using the reference method ::
 * 4. Checking for non null variables
 */

fun main() {

    /*** 1. Using let ***/
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map{ it.length}
        .filter{ it > 3}
        .let {
            println(it)
            println("Size of list is ${it.size}")
        }


    /*** 2. Using a Personalize name instead of it***/
    val animals2 = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals2.map{ it.length}
            .filter{ it > 3}
            .let { filteredList ->
                println(filteredList)
                println("Size of list is ${filteredList.size}")
            }

    /***3. Using the reference method ::***/
    val animals3 = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals3.map{ it.length} // it will be each string
            .filter{ it>3}
            .let(::println)


    /*** 4. Checking for a not null variable***/
    println("Enter your Name: ")
    var name :String? = readLine()

    // if name is null is not going to enter in the next line
    name?.let {
        println("Your name  is $it")
    }
}

