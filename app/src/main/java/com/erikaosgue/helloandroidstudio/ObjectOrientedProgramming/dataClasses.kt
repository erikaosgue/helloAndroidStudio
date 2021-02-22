package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

//Lesson 43. Data Classes
class Book1(val title: String, val author:String, val publicationYear: Int, var price: Double) {

    // This method is hidden in all classes, we can override it to display the information of the object
    // in the way we want for example:
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}
data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main(args: Array<String>) {


    val book = Book1("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val book2 = Book1("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val databook = DataBook("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val databook2 = DataBook("Diario de Ana Frank", "Ana Frank",  1947, 100.0)

    // Copy a data-object
    val databook3 = databook.copy(price=2.99)

    //Decomposing the porperties of a data-object
    val (title, author,year, price) = databook

    //Using hashSetOf() Assing only the unique objects
    val set = hashSetOf(databook, databook2, databook3) // Only will show the databook and the databook3 because they are different
    println("Set of data-objects: $set")

    //Using the hashSetOf in normal classes will not work, it will not recognize a unique objects
    val set2 = hashSetOf(book, book2)
    println("Set of normal-objects: $set2")

    // Printing statements

    println(book)//output: com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming.Book1@5cad8086
    println(databook)//output: DataBook(title=Diario de Ana Frank, author=Ana Frank, publicationYear=1947, price=100.0)



}
