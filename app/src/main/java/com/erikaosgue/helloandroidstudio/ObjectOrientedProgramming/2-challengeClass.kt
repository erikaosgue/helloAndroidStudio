package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not. Choose an appropriate
data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.
*/

class Book(val title: String, val author: String, val publishYear: Int, var borrow: Boolean) {
    init {

    }

    fun info() {
        println("Title: ${this.title}\nAuthor: ${this.author}\nPublication Year: ${this.publishYear}\nIs Borrowed: ${this.borrow}")
    }


}

fun main() {
    var book = Book("100 años de Soledad", "Gabriel García Márquez", 1967, true)
    book.info()
}



