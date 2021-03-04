package com.erikaosgue.course2masterclass.standardFunctions

/**
 * 1. Apply with Car Object
 * 2. Everytime a book is printed, company policy states that we must
 * log the product and send an email
 *
 * Implement this functionality in a program
 */

fun main() {

    println("===== 1. Car exercise ======\n")
    Car().apply {
        speed = 80
        drive()
    }.
        also { car ->
            println("Car is running")
            println("Car speed is ${car.speed}")
        }

    println("\n===== 2. Book exercise ======\n")
    Book().apply {
        printBook()
    }.also { book ->
        // Assume this will go to a log
        println("Printing book $book")
        println("Sending an email about book $book")

    }
}


/*** 2 ***/
class Book {
    fun printBook() {
        println("Printing a book")
    }

}
