package com.erikaosgue.course2masterclass

import java.lang.Exception


/* Lesson 90. Exercise try and Catch

A customer will tell the program what product they want to buy.
Then, they will tell the program how many products they require.
Assume the price of the product is 9.99
What is the total?
Handle any exceptions that might occur.

*/

fun main(args: Array<String>) {
    println("What product do you want to buy? ")
    val product = readLine()

    println("How many would you like to buy?")
    val  quantity= readLine()
    val price = 9.99

    try {
        val amount = quantity?.toInt()
            println("$amount $product will cost ${amount?.times(price)}")

    }catch (e: Exception){
        println("Can't read amount")
        e.printStackTrace()
        e.localizedMessage
    }finally {
        println("Transaction completed!")

    }

}