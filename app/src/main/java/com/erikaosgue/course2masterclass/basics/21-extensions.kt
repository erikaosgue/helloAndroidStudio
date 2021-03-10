package com.erikaosgue.course2masterclass

/**
 * 1. Adding an extension function to a class we don't
 * own or cannot modify -- Access the object using <this>
 *
 * 2. Can add Properties to classes similar to functions using the Getter
 * WARNING: this properties can't be updated
 *
 * 3. Companion Object extensions only if the class has defined already
 * a companion Object
 *
 * --- Exercise_1 ----:
 * Create your Own class Book add a companion object
 * and Create a companion Object function that prints out
 * this "Book has been print"
 * call the companion object function
 *
 * -----Exercise_2-----:
 * Add a companion Object Function to the String
 * Class that prints out a message saying what type of class
 * this is - Call the companion Object function
 *
 * ----- Exercise_3 -----:
 * Exercise: Add a companion object function to
 * the Double class that prints out the class name.
 * Call the companion object extension function.
 *
 */
fun main() {

    /****1.  Extension of Functions ****/
    println(" ===== Extension of a Function =====\n")
    val name = "Erika"
    println(name.cutFirstAndLastChar())
    //name.slim() -> slim means cut first and cut last char




    /***** 2. Extension of Properties ******/
    println("\n ===== Extension of a Property =====\n")
    var name2 = "Michael"
    println(name2.betterLength)




    /***** 3. Extension of Companion Object  ******/
    println("\n ===== Extension of a Companion Object=====\n")
    println("---- Exercise 1 ----")
    Book.printMiCompanionObject()

    //------------------- Exercise 2 ------------------ //
    println("\n---- Exercise 2 ----")
    String.getTypeClass()

    //------ Exercise 3 ----- ------------------
    println("\n---- Exercise 3 ----")
    Double.printClassType()

}


/**** 1. Extension of Functions ****/
fun String.cutFirstAndLastChar() = this.substring(1, length - 1)





/***** 2. Extension of Properties ******/
val String.betterLength: Int
    get() = 200




/***** 3. Extension of Companion Object  ******/
class Book {
    companion object {}
}

// ---- Exercise 1 -----
fun Book.Companion.printMiCompanionObject() {
    println("Book has been print, companion Object")
}

// ------Exercise 2 -----

fun String.Companion.getTypeClass() = println("This is a string line")

//------ Exercise 3 -----
fun Double.Companion.printClassType() = println("This is a double Class")