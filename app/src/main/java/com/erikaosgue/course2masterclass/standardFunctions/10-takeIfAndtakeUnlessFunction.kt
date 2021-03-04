package com.erikaosgue.course2masterclass.standardFunctions

import kotlin.random.Random

fun main() {

    println("===== Using takeIf (true)=====\n")
    for (i in 1..10) {
        val number: Int = Random.nextInt(100)
        val evenOrNull: Int? = number.takeIf { it % 2 == 0 }
        println("The number is $number")
        println("The even number is $evenOrNull")
    }

    println("\n===== Using takeUnless (false)=====\n")

    for (i in 1..10) {

        val number: Int = Random.nextInt(100)
        // {it%2==0} Return the add number, or null if it is even
        val evenOrNull: Int? = number.takeUnless{it % 2 == 0}
        println("The number is $number")
        println("The add number is $evenOrNull")
    }
}

