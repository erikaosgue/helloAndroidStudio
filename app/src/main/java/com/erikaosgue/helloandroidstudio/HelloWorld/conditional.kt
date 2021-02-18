package com.erikaosgue.helloandroidstudio


fun main(args: Array<String>) {

    //Conditional
    val age = 21

    if (age > 18) {
        println("You can't not register")
    }

    var mode = 4

    when (mode) {
        in 0..3 -> println("Number btw 0 and 3")
        2 * 2 -> println("mode is 2 * 2")
        !in 5..9 -> println("mode is not btw 5 and 9")
        is Int -> println("mode is a Int number")
    }

    var z = 0
    var x = 3
    var y = if (x > 3) {
        z = 7
        "x is less than 3"
    } else {
        "x is not less than 3"
    }
    println(y)
}