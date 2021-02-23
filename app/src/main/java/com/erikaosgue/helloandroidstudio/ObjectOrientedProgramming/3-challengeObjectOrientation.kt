package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

/*
Let’s say we’re running a library where you can lend books and also some
movies.
We want to write an application to keep track of our inventory.
Create an interface Lendable that defines a borrow() method.
Then create an abstract class InventoryItem and two classes Book and DVD which inherit from
InventoryItem. InventoryItem should implement the Lendable interface.
Books and DVDs both have a title, genre and publication year. Books also have
an author whereas DVDs have a length in seconds. Add each property to the
most suitable class.


Inventory:
Books:
DvDs:

*/

interface Lendable {

    fun borrow(): Boolean {
        return false
    }
    fun returned(): Boolean {
        return false

    }
}

abstract class InventoryItem(val title: String,
                             val genre: String,
                             var publicationYear: Int,
                             var borrowed: Boolean): Lendable {


    //object movie.borrowed = false
    // this.borrowed = true

    override fun borrow(): Boolean {
        // If the current item is not borrowed
        // then I can borrow it
        if (!borrowed) {
            borrowed = true // How this is works, with this and without
            println("*** Borrowing... Item title=$title")
            return true
        }
        else {
            println("Item is already Borrowed")
            return false
        }

    }

    override fun returned(): Boolean {
       if (borrowed) {
           borrowed = false
           println("*** Returning... Item title=$title...\nThanks for returning the Item\n")
           return true
       }
        else {
            println("You can't return an Item that hasn't been borrowed")
           return false
       }
    }



    override fun toString(): String {
        return "InventoryItem(title=$title, genre=$genre, publicationYear=$publicationYear, borrowed=$borrowed)"
    }


}

class BookLib(title: String,
            genre: String,
            publicationYear: Int,
            val author: String): InventoryItem(title, genre,publicationYear, false){

}



class DvDLib(title: String,
          genre: String,
          publicationYear: Int,
          val length: Int): InventoryItem(title, genre, publicationYear, false){

}

fun main(args: Array<String>) {

    println("=== Books ====\n")

    val book = BookLib("100 años de Soledad", "novel", 1967, "Gabriel Garcia Marquez")
    println("Book1 = $book")
    println("Is the book Borrow? => ${book.borrowed}")

    // Borrow a Book
    book.borrow()
    println("Is the book Borrow? => ${book.borrowed}")
    book.returned()

    val book2 = BookLib("The book Thief", "novel", 2005, "Markus Zusak")
    println("Book2 : $book2")
    println("Is the book2 Borrow? ${book2.borrowed}")
    book2.borrow()
    println("Is the book Borrow? => ${book2.borrowed}")
    book2.returned()


    println("\n=== DvDs ====\n")

    val dvd = DvDLib("Avatar", "Fiction", 2009, 162*60)
    println(dvd)
    println("Is the Dvd Borrow? => ${dvd.borrowed}")

    //Borrow the DvD
    dvd.borrow()
    println("Is the Dvd Borrow? => ${dvd.borrowed}")

    //returning the DvD
    dvd.returned()

}