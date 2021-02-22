package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

//Lesson 43. Data Classes
class Book1(val title: String, val author:String, val publicationYear: Int, var price: Double) {
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}
data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main(args: Array<String>) {
    val book = Book1("Diario de Ana Frank", "Ana Frank",  1947, 100.0)
    val databook = DataBook("Diario de Ana Frank", "Ana Frank",  1947, 100.0)


    println(book)//output: com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming.Book1@5cad8086
    println(databook)//output: DataBook(title=Diario de Ana Frank, author=Ana Frank, publicationYear=1947, price=100.0)

}
