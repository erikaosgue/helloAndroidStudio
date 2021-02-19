package com.erikaosgue.helloandroidstudio.ObjectOrientedProgrammig


/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not. Choose an appropriate
data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.
*/

class Books(val title: String, val author: String, val publishYear: Int, var borrow: Boolean) {
    init {

    }

    fun printBook() {
        println("Title: $this.title, Author: $this.author, Publication Year: $this.publishYear, Is Borrowed: $this.borrow")
    }


}



