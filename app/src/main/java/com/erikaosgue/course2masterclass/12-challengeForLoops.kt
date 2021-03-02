package com.erikaosgue.course2masterclass
/*

Exercise: Extended for loops
Ask the user for a number.

Print out a square matrix of the size indicated by the number.

Inside each cell, print out 1 emoji

😀 If the row*column is divisible by 3
🤨 If the row*column % 3 is 1
😱 If the row*column % 3 is 2

*/

fun main() {
    println("Enter the matrix size: ")
    val input = readLine() ?:""
    val size = input.toInt()

    for (i in 1..size) {
        for (j in 1..size) {
            when (i * j % 3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83E\uDD28\t")
                2 -> print("\uD83D\uDE31\t")
            }
        }
        println()
    }
}