package com.erikaosgue.course2masterclass.standardFunctions
/**
Exercise: Also
Whenever a car is built, the company logs must be updated and the police notified.
Implement this functionality in a program.
*/


fun main() {
    Car2().apply {
        buildCar()
    }.also { car ->
        println("LOG: Building new car $car")
        println("Sending a message to the Police that car $car, has been built")
    }
}

class Car2 {

    fun buildCar() {
        println("Building a new Car")
    }
}