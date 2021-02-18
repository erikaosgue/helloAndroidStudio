package com.erikaosgue.helloandroidstudio

import java.util.*

/*
CHALLENGE CONDITIONAL
Generate a random number between 1 and 50 using the following code:
val random = Random().nextInt(50) + 1
Now, use a when statement to switch between the cases where random is in
the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40.
In each case, print out a message containing the range and the exact value of random.
*/

fun main() {

    val random = Random().nextInt(50) + 1

    when(random) {
        in 1..10 -> println("Range 1 to 10 Random Value = $random")
        in 11..20 ->  println("Range 11 to 20 Random Value = $random")
        in 21..30 ->  println("Range 21 to 30 Random Value = $random")
        in 31..40 ->  println("Range 31 to 40 Random Value = $random")
        else ->  println("Random value more than 40 $random")
    }
}