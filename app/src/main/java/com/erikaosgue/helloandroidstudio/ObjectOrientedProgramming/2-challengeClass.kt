package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not.
Choose an appropriate data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.


Compile the File:
$ kotlinc 2-challengeClass.kt -include-runtime -d 2-challengeClass.jar

Run the jar file:
$ java -jar 2-challengeClass.jar
*/

class Book(val title: String,
           val author: String,
           val publishYear: Int,
           var borrow: Boolean) {
    init {

    }
    fun borrowed() {
        if (borrow) {
            println("The book is already borrow")
            return
        }
        else {
            this.borrow = true
            println("You have succefully borrowed the Book")
            return
        }

    }

    fun returned() {
        if (borrow) {
            println("Thanks for returning the Book")
            this.borrow = false
            return
        }
        else {
            println("the book can't be returned")
            return
        }
    }

    fun info() {
        val borrow = if (this.borrow == true) "Yes" else "No"
        println("Title: ${this.title}\n" +
                "Author: ${this.author}\n" +
                "Publication Year: ${this.publishYear}\n" +
                "Is Borrowed: ${borrow}")
    }

}

fun main() {
    var book = Book(
            "100 años de Soledad",
            "Gabriel García Márquez",
            1967, true)

    book.info()
    book.returned()
    book.borrowed()
    book.borrowed()
    book.returned()
}



