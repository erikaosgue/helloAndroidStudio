package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming

class Person {

    //Creating Properties
    var name: String = "Josh"
    val age: Int = 42


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
    val person = Person()
    println(person.name)
    println(person.age)

    //We can reassing the value of name because
    // the variable is not constants
    // the opposite occures with age, because
    // it is a constant

    person.name = "Juli"
    println(person.name)

    person.speak()
    person.greet("Andrea")
    println(person.getYearOfBirth(22))
    println(person.getYearOfBirth2(22))
}