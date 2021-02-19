package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


// Lesson 37. Named parameters and Default Values


class House(val height: Double, val color: String, val price: Int = 120000) {

    /*init {
        println("object created for color=$color")
    }*/
    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House(4.0, "green", 150000) //Without paramaters names
    val house2 = House(height=4.0, color="green", price=150000)//With name parameters
    val redHouse = House(color="red", height=3.0, price=200000) //The order can vary

    // Using the default parameters
    val yellowHouse = House(height=5.0, color="yellow") //the price is set by default

    house.print()
    redHouse.print()
    yellowHouse.print()

}