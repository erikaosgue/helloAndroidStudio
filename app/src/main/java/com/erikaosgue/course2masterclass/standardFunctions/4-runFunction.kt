package com.erikaosgue.course2masterclass.standardFunctions

fun main() {

    println("==========(NewCar) Run with a return =============\n")
    //update the values
    val newCar = NewCar().run {
        speed = 60
        drive()
        this
    }
    println(newCar)


    println("\n==========(NewCar) Run with a scope =============\n")
    // Separate the scope of the object, (only inside run)
    //important if we are not going to use later
    run {
        val car2 = NewCar()
        car2.speed = 50
        car2.drive()
    }

    println("\n==========(Restaurant) Run with a return ===========\n")

    val restaurant = Restaurant().run {
        standardDish = "Fish and Chips"
        todaySpecial = "Fillet mignon"
        printMenu()
        this
    }
    println(restaurant)

}

class NewCar {
    var speed = 10

    fun drive() {
        println("Car is driving at speed $speed")
    }
}

class Restaurant {
    var standardDish = ""
    var todaySpecial = ""

    fun printMenu() {
        println("The stard disch is $standardDish")
        println("Today's special is $todaySpecial")

    }
}