package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

//Lesson 43. Data Classes


class Book1(val title: String, val author:String, val publicationYear: Int, var price: Double) {

    // This method is hidden in all classes, we can override it to display the information of the object
    // in the way we want for example:
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

/* data Classes can be Useful for:

* Decompose the object properties in individuals variables
* toString() // Give a representation of the object using just println()
* equals() compare is the objects are the same or equal
* copy() copies the object into another one
 */

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main(args: Array<String>) {


    val book = Book1("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val book2 = Book1("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val databook = DataBook("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val databook2 = DataBook("Diario de Ana Frank", "Ana Frank",  1947, 100.0)

    // Copy a data-object
    val databook3 = databook.copy(price=2.99)

    //Decomposing the properties of a data-object
    val (title, author,year, price) = databook

    //Using hashSetOf() Assign only the unique objects
    val set = hashSetOf(databook, databook2, databook3) // Only will show the databook and the databook3 because they are different
    println("Set of data-objects: $set")

    //Using the hashSetOf in normal classes will not work, it will not recognize a unique object, instead will print a repeat value
    val set2 = hashSetOf(book, book2)
    println("Set of normal-objects: $set2")



    // Printing statements

    // With normal classes we need to override the value of toString() method to have data of the object
    println(book)//output: com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming.Book1@5cad8086

    // toString() Display the information of the data-object
    println(databook)//output: DataBook(title=Diario de Ana Frank, author=Ana Frank, publicationYear=1947, price=100.0)


    // Comparing if the objects are the same:

    //This will return false, this method doesn't work for normal classes
    println("Is book.equal(book2): ${book.equals(book2)}")

    //this will return true, this methods is useful for data-object for comparing when they have the same properties
    println("Is databook.equals(databook2):  ${databook.equals(databook2)}")
}
