package com.erikaosgue.course2masterclass

fun main() {

    println("Enter some text: ")
    print("=> ")
    val test = readLine()

    try {
        // Is the input is not a Number the exception Will happened
        println(test?.toInt())

    }catch (e: Exception) {
        // Allow the system print out the message and not show it to hte user
        e.printStackTrace()
        println("An exception happened \n[${e.localizedMessage}]")
    }
}