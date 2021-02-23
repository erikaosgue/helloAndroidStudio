package com.erikaosgue.helloandroidstudio.ObjectOrientedProgramming


//ONE MORE LEVEL FROM Abstract classes

interface Drivable {
    fun drive()
}
interface Buildable {
    val timeRequired: Int
    fun build()
}

//This is for the old exercise
//class Car(val color: String): Drivable, Buildable {

// the following line change String for Color class
// This uses enum class which is better for the program
// It is type Safety declaring the available values, this avoid
// failing or performance issues, because they are int representation internally
// but we cn still access the value Color as a string

class Car(val color: Color): Drivable, Buildable {
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

//    val car: Drivable = Car("Blue")
//    car.drive()

    //The following is for the exercise with the
    //color Class
    val car = Car(Color.GREEN)
    println(car.color)

    val motorCycle: Drivable = MotorCycle("red")
    motorCycle.drive()
}