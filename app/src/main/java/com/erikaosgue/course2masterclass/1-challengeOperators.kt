package com.erikaosgue.course2masterclass


/* Lesson 62 Exercise Operator */

fun main(args: Array<String>) {
    println("Enter the amount in your bank account: ")
    var input = readLine()?.toDouble()?:0.0
    println("The amount of money that you will have after 5 year with interest 5.5% is: ")
    var totalAfter5Year = input + (5 *input*0.055)
    println(totalAfter5Year)

}