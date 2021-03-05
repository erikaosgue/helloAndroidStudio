package com.erikaosgue.course2masterclass

/***
 *
 * ------Exercise1-----:
 * Create a class that takes a generic type T,
 * and has a function that takes an element of type T, converts
 * it to a String and prints tje length of that String
 *
 *------- Exercise2-------:
 * Create a class that takes a generic type T, and has a function that
 * converts the type to String and prints a message that includes the argument passed.
 * Instantiate the class with different types and call the function.
 */
fun main() {

    val myBox = Box<String>()
    myBox.display("My item")

    val carBox = Box<Car5>()
    carBox.display(Car5())

    val newBox = NewBox<Int, Float>()
    newBox.display(1, 2.0F)


    // ------Exercise1-----:

    val info1 = Info<String>()
    info1.getLength("Erika")

    val info2 = Info<Double> ()
    info2.getLength(28.4)

    val info3 = Info<Int> ()
    info3.getLength(45)


    //------- Exercise2-------:
    val myClass = MyClass<Int>()
    myClass.typeToString(410)
}

class Box<Type> {
    fun display(item: Type) {println(item)}
}

class Car5 {

}

class NewBox<T, U> {
    fun display(item: T, item2: U){
        println(item)
        println(item2)
    }
}


// ------Exercise1-----:

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }

}

// ------- Exercise2-------:
class MyClass<T> {
    fun typeToString(msg: T) {
        println("This is the message: ${msg.toString()}")

    }
}