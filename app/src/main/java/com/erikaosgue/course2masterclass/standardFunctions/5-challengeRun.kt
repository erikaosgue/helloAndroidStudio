package com.erikaosgue.course2masterclass.standardFunctions

/**
 * Exercise: Run

A laptop has two functions, turnOn and turnOff.
To make sure it works as expected, every time we have a new laptop
object, the protocol is to turn it off and then back on again.

Create a laptop object and implement the protocol.


 */


fun main() {

    Laptop().run {
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOff() {
        println("Turning laptop OFF")
    }

    fun turnOn() {
        println("Turning Laptop ON")
    }
}