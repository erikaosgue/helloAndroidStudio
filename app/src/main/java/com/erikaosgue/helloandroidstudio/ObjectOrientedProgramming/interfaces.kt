package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


//ONE MORE LEVEL FROM Abstract classes

interface Drivable {
    fun drive()
}
interface Buildable {
    val timeRequired: Int
    fun build()
}


class Car(val color: String): Drivable, Buildable {
    override val timeRequired = 120

    override fun drive() {
       println("Driving car...")
    }

    override fun build() {
        println("Build a shiny Car")
    }

}

class MotorCycle(val color: String): Drivable {

    override fun drive() {
        println("Driving a Motorcycle.")
    }

}


fun main(args: Array<String>) {

    val car: Drivable = Car("Blue")
    car.drive()

    val motorCycle: Drivable = MotorCycle("red")
    motorCycle.drive()
}