package com.erikaosgue.helloandroidstudio.ObjectOrientedProgrammig


// declaring the parameters as variables(var) or values(val) will behave as a constructor
class Person(val name: String, var age: Int) {

    /*
    // In kotlin we can avoid declaring properties
    // So this is not necessary
    var name: String
    var age: Int
    */

    //Creating the Constructor
    init {

        //Same Here we can't avoid the next 2 lines
        /*
        this.name = name
        this.age = age
        */
        println("Object was created")
    }

    //Adding Methods
    fun speak() {
        println("Hello")
    }
    fun greet(name: String) {
        println("Hello $name")
    }
    fun getYearOfBirth(age: Int): Int {
        return 2016-age
    }

    fun getYearOfBirth2(age: Int) = 2016 - age
}

fun main() {

    val person = Person("Erika", 21)
    println(person.name)
    println(person.age)

    //We can reassing the value of name because
    // the variable is not constants
    // the opposite occures with age, because
    // it is a constant

    person.age = 23
    println(person.name)

    person.speak()
    person.greet("Andrea")
    println(person.getYearOfBirth(22))
    println(person.getYearOfBirth2(22))
}
