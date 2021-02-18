package com.erikaosgue.helloandroidstudio

import java.util.*


fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}


// Date is a Java Class
//getCurrentDate will return Date datetype
// We specify the datatype the function will return
//And use the keyword return

fun getCurrentDate(): Date {

    // Date() is an object with the current Date
    return Date()
}

fun max(a: Int, b: Int): Int {
    /*if (a >= b) {
        return a
    }*/

    return if(a >= b) {
        a
    }else {
        b
    }
}

fun main() {

    printWithSpaces("Hello to everyone")
    println(getCurrentDate())
    println(max(17, 42))
}