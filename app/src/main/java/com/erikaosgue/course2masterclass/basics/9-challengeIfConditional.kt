package com.erikaosgue.course2masterclass


/*
You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.

A -> 90 to 100
B -> 80 to 89
C -> 70 to 79
D -> 60 to 69
E -> 50 to 59
F -> everything else
*/

fun main() {

    print("Enter the number of your grade: ")
    val input = readLine()?:"0"
    val number = input.toInt()

    if (number > 100)
        println("Wrong number introduced")
    else {
        val grade = if (number >= 90) {
            "A"
        } else   if (number >= 80) {
            "B"
        } else   if (number >= 70) {
            "C"
        } else if (number >=60) {
            "D"
        } else if (number >= 50) {
            "E"
        } else {
            "F"
        }
        println("You received grade $grade")

    }
}