package com.erikaosgue.course2masterclass

/*
Ask the user to input their name.
Based on the first letter of their name, print out a personalised greeting
for the first 3 letters of the alphabet,
a different one for the next 3 letters, and a third message for the rest
*/


fun main() {

    print("Enter your name: ")
    var name = readLine()?:""

    when(name[0]) {
        'A', 'B', 'C' -> println("Hello $name, welcome")
        in 'D'..'F' -> println("Hi $name how are you")
        else -> println("Hi")
    }


    // Returning a value from a When Statement

    print("Enter the current hour (0-23): ")
    var input = readLine()?:"0"
    var hour = input.toInt()

    if (hour > 23) hour = 23
    val timeOfDay = when(hour) {
        in 6..11 -> "Morning"
        in 12..14 -> "Noon"
        in 15..17 -> "Afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    println("At $hour:00 it's  $timeOfDay")

}
