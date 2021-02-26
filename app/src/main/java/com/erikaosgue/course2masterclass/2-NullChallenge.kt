package com.erikaosgue.course2masterclass

/* Lesson 76: Exercise NULL

Read a number from the console and convert it to Double.
Multiply it by 7, and convert the result into a string.
Print the length of that string to the console.

 */


fun main() {

    print("Please enter a number: ")
    var number :Double? = readLine()?.toDouble()?.times(7)

    println("The length of the $number times 7 is: ${number?.toString()?.length}")


}