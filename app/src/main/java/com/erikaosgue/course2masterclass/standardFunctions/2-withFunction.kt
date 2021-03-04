package com.erikaosgue.course2masterclass.standardFunctions

fun main() {

    println("====== Car Object =======\n")
    // here we instantiate an Object and call functions or update some values
    with(Car()) {
        speed = 80
        drive()
        println("Car is driving")
    }


    // Initializing the Object
    println("\n====== Person Object =======\n")
    with(Person()) {
        firstName = "Erika"
        lastName = "Osorio"
        age = 20
        printPersonInfo()
    }



}

class Car {
    var speed = 50
    fun drive() {
        println("Driving at $speed")
    }
}


class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printPersonInfo() {
        println("$firstName $lastName is $age years old")
    }

}

