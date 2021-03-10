package com.erikaosgue.course2masterclass

import java.lang.Exception

/*

Ask a user to input their age.

If they are under 13, they are a child
If they are under 18, they are a teen
If they are older, they are an adult.

Use ranges to print out the correct message.

If the age is 0, convert it to 1.
*/

fun main() {

    print("Please enter your Age: ")

    var input = readLine()?:"0"
    try {
        var age = input.toInt()

        if (age < 0) {
            println("You can't enter negative numbers")
            return
        }
        if (age == 0) age = 1

        val result = if (age in 0..13)
            "a child!"
        else if (age in 14..19)
            "a Teen!"
        else
            "an Adult!"
        print("User is $result\n")

    }
    catch (e: Exception) {
        println("You should Enter an Integer")
        e.printStackTrace()
    }
    finally {
        println("== END ==")
    }


}
