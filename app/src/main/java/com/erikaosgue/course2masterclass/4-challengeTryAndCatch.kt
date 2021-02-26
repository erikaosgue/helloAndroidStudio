package com.erikaosgue.course2masterclass

import java.lang.Exception


/* Lesson 90. Exercise try and Catch*/

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

    }

}