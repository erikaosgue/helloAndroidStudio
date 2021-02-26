package com.erikaosgue.helloandroidstudio.inputoutput

fun main(args: Array<String>) {

    println("Write a number: ")
    var input = readLine()?.toIntOrNull() ?: 0
    println("your input is: $input")

    println("Write a number: ")
    var inputStr = readLine() ?: "0"
    println("your input is: $inputStr")

}